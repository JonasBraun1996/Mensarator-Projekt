package client;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class Main extends Application {

	public static double summe = 0;
	public static String ausgabe = " ";

	public static void summeGroup (double d, RadioButton rb) {

		summe = 0;

		if (rb.isSelected() == false)
			summe = summe - d;

		if (rb.isSelected())
			summe = summe + d;

		summe = Math.round(summe * 100.0) / 100.0;
		ausgabe = Double.toString(summe);

		// Auf Summenfeld im Footer verweisen

		//Summenfeld.setText(ausgabe + "Euro");

	}

	@Override
	public void start(Stage primaryStage) {

		try {

		/*
			Parent root = FXMLLoader.load(getClass().getResource("/client/client.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Mensarator");
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.show();

			// Legt die minimale Gr��e des Fensters fest.
			primaryStage.setMinWidth(primaryStage.getWidth());
			primaryStage.setMinHeight(primaryStage.getHeight());
*/
			
			  FXMLLoader root = new FXMLLoader(getClass().getResource("/client/client.fxml")); 
			  Parent view = root.load(); 
			  Scene scene = new Scene(view);
			  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			  primaryStage.setTitle("Mensarator");
			  primaryStage.setScene(scene); 
			  primaryStage.show();
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
