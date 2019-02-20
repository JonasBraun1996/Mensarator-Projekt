package application;

import javax.swing.ButtonGroup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

public class Controller {

	@FXML
	private Tab hauptspeiseTab;

	@FXML
	private TabPane tabPane;

	@FXML
	private Button startseite;

	@FXML
	private Button hauptspeiseWeiter;

	@FXML
	private Tab beilageTab;

	@FXML
	private Button beilageWeiter;

	@FXML
	private Button beilageZurueck;

	@FXML
	private Tab getraenkeTab;

	@FXML
	private Button getraenkeWeiter;

	@FXML
	private Button getraenkeZurueck;

	@FXML
	private Tab warenkorbTab;

	@FXML
	private Button bezahlen;

	@FXML
	private Button warenkorbZurueck;

	// Komponenten

	@FXML
	private CheckBox Pommes;

	@FXML
	private CheckBox Reis;

	@FXML
	private CheckBox Spätzle;

	@FXML
	private CheckBox Kroketten;

	@FXML
	private CheckBox Suppe;

	@FXML
	private CheckBox Nudeln;

	@FXML
	private CheckBox Gemüse;

	@FXML
	private CheckBox Salat;

	@FXML
	private CheckBox Kartoffelbrei;

	@FXML
	private CheckBox Popcorn;

	@FXML
	private CheckBox Rahmsoße;

	@FXML
	private CheckBox Jägersoße;

	@FXML
	private CheckBox Bratensoße;

	@FXML
	private TextArea Summenfeld;

	@FXML
	void hauptspeiseWeiterClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(beilageTab);

	}

	@FXML
	void beilageZurueckClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(hauptspeiseTab);

	}

	@FXML
	void beilageWeiterClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(getraenkeTab);

	}

	@FXML
	void GetraenkeZurueckClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(beilageTab);

	}

	@FXML
	void GetraenkeWeiterClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(warenkorbTab);

	}

	@FXML
	void WarenkorbZurueckClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(getraenkeTab);

	}

	double summe = 0;
	String endsumme = " ";

	public void Preisberechnen(ActionEvent e) {

		CheckBox cb = (CheckBox) e.getSource();
		String name = cb.getId();

		switch (name) {

		case ("Pommes"): {

			if (cb.isSelected() == false)
				summe = summe - 1.5;

			if (cb.isSelected())
				summe = summe + 1.5;
			break;

		}

		case ("Reis"): {

			if (cb.isSelected() == false)
				summe = summe - 1.1;

			if (cb.isSelected())
				summe = summe + 1.1;

			break;

		}

		case ("Spätzle"): {

			if (cb.isSelected() == false)
				summe = summe - 1.3;

			if (cb.isSelected())
				summe = summe + 1.3;

			break;

		}

		case ("Kroketten"): {

			if (cb.isSelected() == false)
				summe = summe - 1.5;

			if (cb.isSelected())
				summe = summe + 1.5;

			break;

		}
		
		case ("Suppe"): {

			if (cb.isSelected() == false)
				summe = summe - 1.0;

			if (cb.isSelected())
				summe = summe + 1.0;

			break;

		}
		
		case ("Nudeln"): {

			if (cb.isSelected() == false)
				summe = summe - 1.2;

			if (cb.isSelected())
				summe = summe + 1.2;

			break;

		}
		
		case ("Gemüse"): {

			if (cb.isSelected() == false)
				summe = summe - 1.2;

			if (cb.isSelected())
				summe = summe + 1.2;

			break;

		}
		
		case ("Salat"): {

			if (cb.isSelected() == false)
				summe = summe - 1.5;

			if (cb.isSelected())
				summe = summe + 1.5;

			break;

		}
		
		case ("Kartoffelbrei"): {

			if (cb.isSelected() == false)
				summe = summe - 1.6;

			if (cb.isSelected())
				summe = summe + 1.6;

			break;

		}
		
		case ("Popcorn"): {

			if (cb.isSelected() == false)
				summe = summe - 1.6;

			if (cb.isSelected())
				summe = summe + 1.6;

			break;

		}
		
		case ("Rahmsoße"): {

			if (cb.isSelected() == false)
				summe = summe - 0.7;

			if (cb.isSelected())
				summe = summe + 0.7;

			break;

		}
		
		case ("Jägersoße"): {

			if (cb.isSelected() == false)
				summe = summe - 0.8;

			if (cb.isSelected())
				summe = summe + 0.8;

			break;

		}
		
		case ("Bratensoße"): {

			if (cb.isSelected() == false)
				summe = summe - 0.7;

			if (cb.isSelected())
				summe = summe + 0.7;

			break;

		}


		}
		summe=Math.round(summe*100.0)/100.0;
		endsumme = Double.toString(summe);
		Summenfeld.setText(endsumme+"0 €");

	}

}
