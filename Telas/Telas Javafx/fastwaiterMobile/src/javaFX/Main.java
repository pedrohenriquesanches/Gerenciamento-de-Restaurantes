package javaFX;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application{	
	
	public static void main(String[] args){	
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		LoaderFXML l = new LoaderFXML();
		try {
			l.setNome("Login.fxml");
			l.start(new Stage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
