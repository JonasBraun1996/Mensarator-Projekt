package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import hauptspeise.Controllerhauptspeise;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController implements Initializable {

	@FXML
	private BorderPane root;

	@FXML
	private Button startConfiguration;

	public static Controllerhauptspeise controllerHauptspeise;
	
	Stage secondStage = new Stage();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		FXMLLoader loaderHauptspeise = new FXMLLoader(getClass().getResource("Test.fxml"));
		Parent view = null;
		try {
		view = loaderHauptspeise.load();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(view);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		secondStage.setTitle("Konfigurator");
		secondStage.setScene(scene);
		
		
		
	}
    @FXML
    void start(ActionEvent event) {
		secondStage.show();
    }
}
