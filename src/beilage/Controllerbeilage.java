package beilage;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;

public class Controllerbeilage {
	
	
	@FXML
	public Tab beilageTab;

	@FXML
	private Button beilageWeiter;

	@FXML
	private Button beilageZurueck;
	
	@FXML
	private RadioButton Pommes;

	@FXML
	private RadioButton Reis;

	@FXML
	private RadioButton Spaetzle;

	@FXML
	private RadioButton Kroketten;

	@FXML
	private RadioButton Suppe;

	@FXML
	private RadioButton Nudeln;

	@FXML
	private RadioButton Gemuese;

	@FXML
	private RadioButton Salat;

	@FXML
	private RadioButton Kartoffelbrei;

	@FXML
	private RadioButton Popcorn;

	@FXML
	private RadioButton Rahmsosse;

	@FXML
	private RadioButton Jaegersosse;

	@FXML
	private RadioButton Bratensosse;

	
	
	@FXML
	void beilageZurueckClicked(ActionEvent event) {

		//tabPane.getSelectionModel().select(hauptspeiseTab);

	}

	@FXML
	void beilageWeiterClicked(ActionEvent event) {

		//tabPane.getSelectionModel().select(getraenkeTab);

	}
	
	public void PreisberechnenBL(ActionEvent e) {

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		/*switch (name) {

		case ("Pommes"): {

			summe(1.5, rb);
			break;

		}

		case ("Reis"): {

			summe(1.1, rb);
			break;

		}

		case ("Spaetzle"): {

			summe(1.3, rb);

			break;

		}

		case ("Kroketten"): {
			summe(1.5, rb);

			break;

		}

		case ("Suppe"): {

			summe(1.0, rb);

			break;

		}

		case ("Nudeln"): {

			summe(1.2, rb);

			break;

		}

		case ("Gemuese"): {

			summe(1.2, rb);

			break;

		}

		case ("Salat"): {

			summe(1.5, rb);

			break;

		}

		case ("Kartoffelbrei"): {

			summe(1.6, rb);

			break;

		}

		case ("Popcorn"): {
			summe(1.6, rb);

			break;

		}
		case ("Rahmsosse"): {

			summe(0.7, rb);
			break;

		}

		case ("Jaegersosse"): {

			summe(0.8, rb);
			break;

		}

		case ("Bratensosse"): {

			summe(0.7, rb);
			break;

*/

	
}
}