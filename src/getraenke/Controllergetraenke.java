package getraenke;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;

public class Controllergetraenke {
	
	@FXML
	public TabPane tabPane;
	
	@FXML
	public Tab getraenkeTab;

	@FXML
	private Button getraenkeWeiter;

	@FXML
	private Button getraenkeZurueck;

	@FXML
	private TextArea SummenfeldGetraenk;

	
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
	
	/*@FXML
	void GetraenkeZurueckClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(beilageTab);

	}

	@FXML
	void GetraenkeWeiterClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(warenkorbTab);

	}
*/
}
