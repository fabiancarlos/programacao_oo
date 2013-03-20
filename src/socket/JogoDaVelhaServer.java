package socket;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class JogoDaVelhaServer extends JFrame {

   private byte tabuleiro[];
   private boolean xMove;
   private JTextArea txaSaida;
   private Player jogadores[];
   private ServerSocket server;
   private int jogadorAtual;

   public JogoDaVelhaServer()
   {
      super( "Servidor do Jogo da Velha" );

      tabuleiro = new byte[ 9 ];
      xMove = true;
      jogadores = new Player[ 2 ];
      jogadorAtual = 0;
 
      // set up ServerSocket
      try {
         server = new ServerSocket( 5000, 2 );
      }
      catch( IOException e ) {
         e.printStackTrace();
         System.exit( 1 );
      }

      txaSaida = new JTextArea();
      getContentPane().add( txaSaida, BorderLayout.CENTER );
      txaSaida.setText( "Server awaiting connections\n" );

      setSize( 300, 300 );
      setVisible(true);
   }

   // wait for two connections so game can be played
   public void execute()
   {
      for ( int i = 0; i < jogadores.length; i++ ) {
         try {
            jogadores[ i ] =
               new Player( server.accept(), this, i );
            jogadores[ i ].start();
         }
         catch( IOException e ) {
            e.printStackTrace();
            System.exit( 1 );
         }
      }

      // Player X is suspended until Player O connects.
      // Resume player X now.          
      synchronized ( jogadores[ 0 ] ) {
         jogadores[ 0 ].threadSuspended = false;   
         jogadores[ 0 ].notify();
      }
  
   }
   
   public void display( String s )
   {
      txaSaida.append( s + "\n" );
   }
 
   // Determine if a move is valid.
   // This method is synchronized because only one move can be
   // made at a time.
   public synchronized boolean validMove( int loc,
                                          int player )
   {
      boolean moveDone = false;

      while ( player != jogadorAtual ) {
         try {
            wait();
         }
         catch( InterruptedException e ) {
            e.printStackTrace();
         }
      }

      if ( !isOccupied( loc ) ) {
         tabuleiro[ loc ] =
            (byte) ( jogadorAtual == 0 ? 'X' : 'O' );
         jogadorAtual = ( jogadorAtual + 1 ) % 2;
         jogadores[ jogadorAtual ].otherPlayerMoved( loc );
         notify();    // tell waiting player to continue
         return true;
      }
      else 
         return false;
   }

   public boolean isOccupied( int loc )
   {
      if ( tabuleiro[ loc ] == 'X' || tabuleiro [ loc ] == 'O' )
          return true;
      else
          return false;
   }

   public boolean gameOver()
   {
      // Place code here to test for a winner of the game
      return false;
   }

   public static void main( String args[] )
   {
      JogoDaVelhaServer game = new JogoDaVelhaServer();

      game.addWindowListener( new WindowAdapter() {
        public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );

      game.execute();
   }
}

// Player class to manage each Player as a thread
class Player extends Thread {
   private Socket connection;
   private DataInputStream input;
   private DataOutputStream output;
   private JogoDaVelhaServer control;
   private int number;
   private char mark;
   protected boolean threadSuspended = true;

   public Player( Socket s, JogoDaVelhaServer t, int num )
   {
      mark = ( num == 0 ? 'X' : 'O' );

      connection = s;
      
      try {
         input = new DataInputStream(
                    connection.getInputStream() );
         output = new DataOutputStream(
                    connection.getOutputStream() );
      }
      catch( IOException e ) {
         e.printStackTrace();
         System.exit( 1 );
      }

      control = t;
      number = num;
   }

   public void otherPlayerMoved( int loc )
   {
      try {
         output.writeUTF( "Opponent moved" );
         output.writeInt( loc );
      }
      catch ( IOException e ) { e.printStackTrace(); }
   }

   public void run()
   {
      boolean done = false;

      try {
         control.display( "Player " +
            ( number == 0 ? 'X' : 'O' ) + " connected" );
         output.writeChar( mark );
         output.writeUTF( "Player " +
            ( number == 0 ? "X connected\n" :
                            "O connected, please wait\n" ) );

         // wait for another player to arrive
         if ( mark == 'X' ) {
            output.writeUTF( "Waiting for another player" );

            try {
               synchronized( this ) {   
                  while ( threadSuspended )
                     wait();  
               }
            } 
            catch ( InterruptedException e ) {
               e.printStackTrace();
            }

            output.writeUTF(
               "Other player connected. Your move." );
         }

         // Play game
         while ( !done ) {
            int location = input.readInt();

            if ( control.validMove( location, number ) ) {
               control.display( "loc: " + location );
               output.writeUTF( "Valid move." );
            }
            else 
               output.writeUTF( "Invalid move, try again" );

            if ( control.gameOver() )
               done = true;
         }         

         connection.close();
      }
      catch( IOException e ) {
         e.printStackTrace();
         System.exit( 1 );
      }
   }
}                                                         

