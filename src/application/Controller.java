package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
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
	private RadioButton Rahmsoße;

	@FXML
	private RadioButton Jaegersoße;

	@FXML
	private RadioButton Bratensoße;

	@FXML
	private TextArea SummenfeldBL;

	@FXML
	private TextArea SummefeldHS;

	@FXML
	private RadioButton Menue1;

	@FXML
	private RadioButton Menue2;

	@FXML
	private RadioButton Menue3;

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

	double summeInsgesamt = 0;

	public void PreisberechnenHS(ActionEvent e) {

		double summeHaupt = 0;
		String endsummeHaupt = " ";

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Menue1"):

			if (rb.isSelected() == false)
				summeHaupt = summeHaupt - 2.00;

			if (rb.isSelected())
				summeHaupt = summeHaupt + 2.00;
			break;

		}

		switch (name) {

		case ("Menue2"):

			if (rb.isSelected() == false)
				summeHaupt = summeHaupt - 2.10;

			if (rb.isSelected())
				summeHaupt = summeHaupt + 2.10;
			break;

		}

		switch (name) {

		case ("Menue3"):

			if (rb.isSelected() == false)
				summeHaupt = summeHaupt - 1.90;

			if (rb.isSelected())
				summeHaupt = summeHaupt + 1.90;
			break;

		}

		summeHaupt = Math.round(summeHaupt * 100.0) / 100.0;
		summeInsgesamt = summeHaupt;
		endsummeHaupt = Double.toString(summeHaupt);
		SummefeldHS.setText(endsummeHaupt + "0 €");

	}

	double summeBL=summeInsgesamt;
	String endsummeBL = " ";

	public void PreisberechnenBL(ActionEvent e) {
		

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Pommes"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.5;

			if (rb.isSelected())
				summeBL = summeBL + 1.5;
			break;

		}

		case ("Reis"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.1;

			if (rb.isSelected())
				summeBL = summeBL + 1.1;

			break;

		}

		case ("Spaetzle"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.3;

			if (rb.isSelected())
				summeBL = summeBL + 1.3;

			break;

		}

		case ("Kroketten"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.5;

			if (rb.isSelected())
				summeBL = summeBL + 1.5;

			break;

		}

		case ("Suppe"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.0;

			if (rb.isSelected())
				summeBL = summeBL + 1.0;

			break;

		}

		case ("Nudeln"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.2;

			if (rb.isSelected())
				summeBL = summeBL + 1.2;

			break;

		}

		case ("Gemuese"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.2;

			if (rb.isSelected())
				summeBL = summeBL + 1.2;

			break;

		}

		case ("Salat"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.5;

			if (rb.isSelected())
				summeBL = summeBL + 1.5;

			break;

		}

		case ("Kartoffelbrei"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.6;

			if (rb.isSelected())
				summeBL = summeBL + 1.6;

			break;

		}

		case ("Popcorn"): {

			if (rb.isSelected() == false)
				summeBL = summeBL - 1.6;

			if (rb.isSelected())
				summeBL = summeBL + 1.6;

			break;

		}

		}
		summeBL = Math.round(summeBL * 100.0) / 100.0;
		endsummeBL = Double.toString(summeBL);
		SummenfeldBL.setText(endsummeBL + "0 €");

	}

	public void PreisberechnenSoße(ActionEvent e) {

		double summeSoße = summeInsgesamt;
		String endsummeSoße = " ";

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Rahmsoße"):

			if (rb.isSelected() == false)
				summeSoße = summeSoße - 0.7;

			if (rb.isSelected())
				summeSoße = summeSoße + 0.7;
			break;

		}

		switch (name) {

		case ("Jaegersoße"):

			if (rb.isSelected() == false)
				summeSoße = summeSoße - 0.8;

			if (rb.isSelected())
				summeSoße = summeSoße + 0.8;
			break;

		}

		switch (name) {

		case ("Bratensoße"):

			if (rb.isSelected() == false)
				summeSoße = summeSoße - 0.7;

			if (rb.isSelected())
				summeSoße = summeSoße + 0.7;
			break;

		}

		summeSoße = Math.round(summeSoße * 100.0) / 100.0;
		endsummeSoße = Double.toString(summeSoße);
		SummenfeldBL.setText(endsummeSoße + "0 €");

	}

}
