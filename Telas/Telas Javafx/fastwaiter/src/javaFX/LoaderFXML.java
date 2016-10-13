package javaFX;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoaderFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root;

		try {			
			root = FXMLLoader.load(getClass().getResource(nomeFXML));			

		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		Scene scene = new Scene(root);		
		scene.setFill(Color.TRANSPARENT);
		
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();		
		primaryStage.show();
		
				
	}
	
	
	private String nomeFXML = "Principal.fxml";
	public void setNome(String nome){
		this.nomeFXML = nome;
	}

		
	
}
