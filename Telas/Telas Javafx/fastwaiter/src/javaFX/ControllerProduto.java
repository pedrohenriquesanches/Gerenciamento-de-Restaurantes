package javaFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ControllerProduto implements Initializable {

	@FXML
	private void bt_Novo_Selected(ActionEvent event) throws IOException {

		lb_Titulo.setText("Produtos - Novo");
		visibilidadeBusca(false);
		bt_inferior_esq.setText("Salvar");
		bt_Excluir.setVisible(false);
		botaoSelecionado(bt_Novo);
		botaoNaoSelecionado(bt_Alterar);
		botaoNaoSelecionado(bt_Consultar);

	}

	@FXML
	private void bt_Alterar_Selected(ActionEvent event) throws IOException {

		lb_Titulo.setText("Produtos - Alterar");
		visibilidadeBusca(true);
		bt_inferior_esq.setText("Salvar");
		bt_Excluir.setVisible(true);
		botaoSelecionado(bt_Alterar);
		botaoNaoSelecionado(bt_Novo);
		botaoNaoSelecionado(bt_Consultar);
	}

	@FXML
	private void bt_Consultar_Selected(ActionEvent event) throws IOException {

		lb_Titulo.setText("Produtos - Consulta");
		visibilidadeBusca(true);
		bt_inferior_esq.setText("Historico");
		bt_Excluir.setVisible(false);
		botaoSelecionado(bt_Consultar);
		botaoNaoSelecionado(bt_Alterar);
		botaoNaoSelecionado(bt_Novo);
	}

	private void visibilidadeBusca(boolean value) {

		lb_Busca.setVisible(value);
		tx_Busca.setVisible(value);
		bt_Buscar.setVisible(value);

	}

	private void botaoSelecionado(Button b) {
		b.setStyle(
				"-fx-background-color: linear-gradient(#E5D120,#EEDC42); -fx-border-color: linear-gradient(#E5D120,#EEDC42); -fx-text-fill: white; -fx-effect:  dropshadow(two-pass-box , darkgray, 10, 0.0 , 4, 5);");
	}

	private void botaoNaoSelecionado(Button b) {
		b.setStyle(
				"-fx-background-color: #F9F9F9; -fx-border-color: #F9F9F9; -fx-text-fill: #444444 ; -fx-effect:  dropshadow(two-pass-box , darkgray, 10, 0.0 , 4, 5);");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// initialize Pane
		assert pn_Clientes != null : "fx:id=\"pn_Clientes\" was not injected: check your FXML file 'Cliente.fxml'.";
		// initialize Label
		assert lb_Titulo != null : "fx:id=\"lb_Titulo\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert lb_Busca != null : "fx:id=\"lb_Busca\" was not injected: check your FXML file 'Cliente.fxml'.";
		// initialize Button
		assert bt_Novo != null : "fx:id=\"bt_Novo\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert bt_Alterar != null : "fx:id=\"bt_Alterar\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert bt_Consultar != null : "fx:id=\"bt_Consultar\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert bt_Buscar != null : "fx:id=\"bt_Buscar\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert bt_inferior_esq != null : "fx:id=\"bt_inferior_esq\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert bt_inferior_dir != null : "fx:id=\"bt_inferior_dir\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert bt_Ajuda != null : "fx:id=\"bt_Ajuda\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert bt_Excluir != null : "fx:id=\"bt_Excluir\" was not injected: check your FXML file 'Cliente.fxml'.";
		// Initialize TextField
		assert tx_Codigo != null : "fx:id=\"tx_Codigo\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Nome != null : "fx:id=\"tx_Nome\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Sobrenome != null : "fx:id=\"tx_Sobrenome\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_CPF != null : "fx:id=\"tx_CPF\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Telefone != null : "fx:id=\"tx_Telefone\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Celular != null : "fx:id=\"tx_Celular\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_CEP != null : "fx:id=\"tx_CEP\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Logradouro != null : "fx:id=\"tx_Logradouro\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Numero != null : "fx:id=\"tx_Numero\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Bairro != null : "fx:id=\"tx_Bairro\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Cidade != null : "fx:id=\"tx_Cidade\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Estado != null : "fx:id=\"tx_Estado\" was not injected: check your FXML file 'Cliente.fxml'.";
		assert tx_Busca != null : "fx:id=\"tx_Busca\" was not injected: check your FXML file 'Cliente.fxml'.";

		lb_Titulo.setText("Produtos - Novo");
		visibilidadeBusca(false);
		bt_inferior_esq.setText("Salvar");
		bt_Excluir.setVisible(false);
		botaoSelecionado(bt_Novo);
		botaoNaoSelecionado(bt_Alterar);
		botaoNaoSelecionado(bt_Consultar);

	}

	// Pane
	@FXML
	private Pane pn_Clientes;

	// Label
	@FXML
	private Label lb_Titulo;
	@FXML
	private Label lb_Busca;

	// Button
	@FXML
	private Button bt_Novo;
	@FXML
	private Button bt_Alterar;
	@FXML
	private Button bt_Consultar;
	@FXML
	private Button bt_Buscar;
	@FXML
	private Button bt_inferior_esq;
	@FXML
	private Button bt_inferior_dir;
	@FXML
	private Button bt_Ajuda;
	@FXML
	private Button bt_Excluir;

	// TextField
	@FXML
	private TextField tx_Codigo;
	@FXML
	private TextField tx_Nome;
	@FXML
	private TextField tx_Sobrenome;
	@FXML
	private TextField tx_CPF;
	@FXML
	private TextField tx_Telefone;
	@FXML
	private TextField tx_Celular;
	@FXML
	private TextField tx_CEP;
	@FXML
	private TextField tx_Logradouro;
	@FXML
	private TextField tx_Numero;
	@FXML
	private TextField tx_Bairro;
	@FXML
	private TextField tx_Cidade;
	@FXML
	private TextField tx_Estado;
	@FXML
	private TextField tx_Busca;

}
