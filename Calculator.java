package Laskin;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application {
	
	// After launching this Application in Main, this class runs init(), which calls start() method
	
	@Override
	public void init() {
		System.out.println("Initializing...");
	}
	
	@Override
	public void start(Stage stage) {
		
		// In try part we load the fxml file 
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("gui.fxml"));
			Parent root = loader.load();
			System.out.println("Loaded gui.fxml");
			
			try {
				System.out.println("Controller: " + loader.getController());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
			/* After we have loaded the fxml
			 * we create a new scene with the loaded fxml as root and show it.¨
			 * This launches the created GUI
			 */
			
			Scene scene = new Scene(root);
			stage.setTitle("Calculator");
			stage.setScene(scene);
			stage.show();
		} 
		catch (Exception e) {
			e.printStackTrace();
			Platform.exit();
		}
	}
	
	@Override
	public void stop() {
		System.out.println("Terminated");
	}

}
