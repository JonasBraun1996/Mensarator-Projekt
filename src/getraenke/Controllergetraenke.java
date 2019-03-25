package getraenke;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Controllergetraenke implements Initializable{
	
	@FXML
	public TabPane tabPane;
	
	@FXML
	public Tab getraenkeTab;

	@FXML
	private Button getraenkeWeiter;

	@FXML
	private Button getraenkeZurueck;
	
	@FXML
	private RadioButton Fanta;

	@FXML
	private RadioButton Spezi;

	@FXML
	private RadioButton RedBull;

	@FXML
	private RadioButton Ayran;

	@FXML
	private RadioButton Wasser;

	@FXML
	private RadioButton Apfelsaft;

	@FXML
	private RadioButton Sprite;

	@FXML
	private RadioButton Cola;

	@FXML
	private RadioButton CapriSonne;
	
	@FXML 
	private Button weiterZuWarenkorb;
	
	@FXML
    private BorderPane rootGetraenke;
	
	Pane center;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			center = FXMLLoader.load(getClass().getResource("/warenkorb/warenkorb.fxml"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@FXML
    void weiterZuWarenkorb(ActionEvent event) {
		rootGetraenke.setCenter(center);
    }
}
