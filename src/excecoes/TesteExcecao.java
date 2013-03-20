package excecoes;

public class TesteExcecao {

	   public static void main (String[] args) {

	      try {
	         int len = args.length;
	         System.out.println(args[len*2]);
	      }

	      catch (ArithmeticException e) {
	         System.out.print("1");
	      }

	      catch (RuntimeException e) {
	         System.out.print("2");
	      }      

	      catch (Exception e) {
	         System.out.println("3");
	      }

	      finally {
	         System.out.print("4");
	      }

	      System.out.print(" Fim");

	   }

	}