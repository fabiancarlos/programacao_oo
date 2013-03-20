package jppreti.locadora.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jppreti.locadora.Cidade;
import jppreti.locadora.Estado;

public class ClienteGUI extends Application {
	
	GridPane grid;
	Label lblNome, lblDataNascimento, lblSexo, lblCpf, lblTelefone, lblLogradouro,
			lblNumero, lblBairro, lblComplemento, lblCep, lblEstado, lblCidade, lblPontos;
	
	TextField txtNome, txtDataNascimento, txtCpf, txtTelefone, txtLogradouro, txtNumero,
				txtBairro, txtCep, txtComplemento;
	
	RadioButton rdbMasc, rdbFem;
	ChoiceBox<Estado> chbEstado;
	ChoiceBox<Cidade> chbCidade;
	Text txtPontos;
	
	
	@Override
	public void start (Stage stage) throws Exception {
		grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		grid.setAlignment(Pos.CENTER);
		
		//Primeira Linha
		lblNome = new Label("Nome:");
		grid.add(lblNome, 0, 0);
		
		txtNome = new TextField();
		grid.add(txtNome, 1, 0, 3, 1); //(coluna, linha, mesclagem coluna, mesclagem linha)
		
		lblSexo = new Label("Sexo:");
		grid.add(lblSexo, 4, 0);
		
		rdbMasc = new RadioButton("Masculino");
		rdbFem = new RadioButton("Feminino");
		HBox hbox = new HBox(10);
		hbox.getChildren().addAll(rdbMasc, rdbFem);
		grid.add(hbox, 5, 0);
		
		//Segunda Linha
		lblDataNascimento = new Label("Data Nascimento:");
		grid.add(lblDataNascimento, 0, 1);
		
		txtDataNascimento = new TextField();
		grid.add(txtDataNascimento, 1, 1);
		
		lblCpf = new Label("CPF:");
		grid.add(lblCpf, 2, 1);
		
		txtCpf = new TextField();
		grid.add(txtCpf, 3, 1);
		
		lblTelefone = new Label("Telefone:");
		grid.add(lblTelefone, 4, 1);
		
		txtTelefone = new TextField();
		grid.add(txtTelefone, 5, 1);
		
		//Terceira Linha
		lblLogradouro = new Label("Logradouro:");
		grid.add(lblLogradouro, 0, 2);
		
		txtLogradouro = new TextField();
		grid.add(txtLogradouro, 1, 2, 3, 1);
		
		lblNumero = new Label("Número:");
		grid.add(lblNumero, 4, 2);
		
		txtNumero = new TextField();
		grid.add(txtNumero, 5, 2);
		
		//Quarta Linha
		lblBairro = new Label("Bairro:");
		grid.add(lblBairro, 0, 3);
		
		txtBairro = new TextField();
		grid.add(txtBairro, 1, 3, 3, 1);
		
		lblCep = new Label("CEP:");
		grid.add(lblCep, 4, 3);
		
		txtCep = new TextField();
		grid.add(txtCep, 5, 3);
		
		//Quinta Linha
		lblComplemento = new Label("Complemento:");
		grid.add(lblComplemento, 0, 4);
		
		txtComplemento = new TextField();
		grid.add(txtComplemento, 1, 4, 5, 1);
		
		//Sexta Linha
		lblEstado = new Label("Estado:");
		grid.add(lblEstado, 0, 5);
		
		chbEstado = new ChoiceBox<Estado>();
		grid.add(chbEstado, 1, 5, 2, 1);
		
		lblCidade = new Label("Cidade:");
		grid.add(lblCidade, 3, 5);
		
		chbCidade = new ChoiceBox<Cidade>();
		grid.add(chbCidade, 4, 5, 2, 1);
		
		//Sétima Linha
		lblPontos = new Label("Pontos Fidelidade:");
		grid.add(lblPontos, 0, 6);
		
		txtPontos = new Text();
		grid.add(txtPontos, 1, 6);
		
		
		Scene scene = new Scene(grid, 800, 250);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
