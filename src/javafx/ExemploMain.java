package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ExemploMain extends Application{
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage){
		primaryStage.setTitle("Hello World");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 250);
		//scene.getStylesheets().add("/diretorio/arquivo.css");
		
		final Button btn = new Button();
		btn.setLayoutX(80);
		btn.setLayoutY(80);
		btn.setText("Hello World");
		btn.setStyle("-fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0);" +
				     "-fx-font: bold italic 20pt \"Arial\";" +
				     "-fx-background-color: yellow");
		
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0){
				System.out.println("Botão foi pressionado!");
			}
		});
		
		btn.setOnMouseEntered(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent arg0){
				btn.setText("Clica em mim!");
			}
		});
		
		btn.setOnMouseExited(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent arg0){
				btn.setText("Volta aqui!");
			}
		});
		
		root.getChildren().add(btn);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
