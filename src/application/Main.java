package application;

import hauptspeise.Controllerhauptspeise;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static AllInOneController fcont;
	public static Controllerhauptspeise ha;
	public static String aktuell = "";
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loaderMain = new FXMLLoader(getClass().getResource("/application/AllInOne.fxml"));
			Parent root = loaderMain.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
			FXMLLoader loaderHa = new FXMLLoader(getClass().getResource("/hauptspeise/hauptspeise2.fxml"));
			ha = loaderHa.getController();
			primaryStage.getIcons().add(new Image("/application/Gabel_Icon.png"));
			primaryStage.setMaxWidth(780);
			primaryStage.setMinWidth(620);
			primaryStage.setMaxHeight(560);
			primaryStage.setMinHeight(450);
			primaryStage.setTitle("Mensarator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}