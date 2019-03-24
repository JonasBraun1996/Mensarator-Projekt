package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import hauptspeise.Controllerhauptspeise;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController extends Application implements Initializable {
	
	@FXML
    private BorderPane root;
	
	@FXML
	private Button startConfiguration;
	
	@FXML
	private Button startMensarator;
	
	boolean initialize = false;
	
	@FXML
	void startClicked (ActionEvent event) {
		initialize = true;
	}
	
	public static Controllerhauptspeise controllerHauptspeise;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		if(initialize){
			try {
	
				FXMLLoader loaderHauptspeise = new FXMLLoader(getClass().getResource("../hauptspeise/hauptspeisepane.fxml"));
				BorderPane centerPane = loaderHauptspeise.load();
				root.setCenter(centerPane);
				controllerHauptspeise = loaderHauptspeise.getController();
				Parent view = centerPane;
				Scene scene = new Scene(view);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				
	
	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		if(initialize) {
			FXMLLoader loaderHauptspeise = new FXMLLoader(getClass().getResource("../hauptspeise/hauptspeisepane.fxml"));
			BorderPane centerPane = loaderHauptspeise.load();
			Parent view = centerPane;
			Scene scene = new Scene(view);
			primaryStage.setTitle("Mensarator");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		
	}
}
