package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

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
	private Tab StartseiteTab;
	@FXML
	private ToggleGroup menue;
	
	@FXML
	private Button beilageWeiter;

	@FXML
	private Button beilageZurueck;

	@FXML
	private Button meineBestellungZurueckBtn;

	@FXML
	private Button bezahlungBeendenBtn;

	@FXML
	private Button meineBestellungBtn;

	@FXML
	private Tab getraenkeTab;

	@FXML
	private Button getraenkeWeiter;

	@FXML
	private Button getraenkeZurueck;

	@FXML
	private Button konfigStartenBtn;

	@FXML
	private Button bezahlenBtn;

	@FXML
	private Tab Startseite;

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
	private RadioButton Rahmsosse;

	@FXML
	private RadioButton Jaegersosse;

	@FXML
	private RadioButton Bratensosse;

	@FXML
	private TextArea SummenfeldBL;

	@FXML
	private TextArea SummefeldHS;

	@FXML
	private TextArea SummenfeldGetraenk;

	@FXML
	private RadioButton Menue1;

	@FXML
	private RadioButton Menue2;

	@FXML
	private RadioButton Menue3;

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
	void hauptspeiseWeiterClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(beilageTab);

	}

	@FXML
	void zurHauptspeiseOnClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(hauptspeiseTab);
	}

	@FXML
	void meineBestellungWindowOnClick(ActionEvent event) {

		try {
			FXMLLoader order = new FXMLLoader(getClass().getResource("MYORDER.fxml"));
			Parent root = (Parent) order.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Fenster nach verlassen schliessen
		Stage close = (Stage) meineBestellungBtn.getScene().getWindow();
		close.close();

	}

	@FXML
	void meineBestellungZurueckBtnOnClicked(ActionEvent event) {

		try {
			FXMLLoader order = new FXMLLoader(getClass().getResource("GUI.fxml"));
			Parent root = (Parent) order.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Fenster nach verlassen schlie�en
		Stage close = (Stage) meineBestellungZurueckBtn.getScene().getWindow();
		close.close();
	}

	@FXML
	void bezahlenOnClicked(ActionEvent event) {

		try {
			FXMLLoader order = new FXMLLoader(getClass().getResource("PAY.fxml"));
			Parent root = (Parent) order.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Fenster nach verlassen schlie�en
		Stage close = (Stage) bezahlenBtn.getScene().getWindow();
		close.close();
	}

	@FXML
	void bezahlungBeendenBtnOnClicked(ActionEvent event) {

		try {
			FXMLLoader order = new FXMLLoader(getClass().getResource("GUI.fxml"));
			Parent root = (Parent) order.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Fenster nach verlassen schlie�en
		Stage close = (Stage) bezahlungBeendenBtn.getScene().getWindow();
		close.close();
	}

	@FXML
	void ZurueckZurStartseite(ActionEvent event) {

		tabPane.getSelectionModel().select(StartseiteTab);

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

	double s = 0;

	String ausgabe = " ";

	public void summeGroup(double d, RadioButton rb) {

		s = 0;

		if (rb.isSelected() == false)
			s = s - d;

		if (rb.isSelected())
			s = s + d;

		s = Math.round(s * 100.0) / 100.0;
		ausgabe = Double.toString(s);
		SummenfeldBL.setText(ausgabe + "0 Euro");
		SummefeldHS.setText(ausgabe + "0 Euro");
		SummenfeldGetraenk.setText(ausgabe + "0 Euro");

	}

	public void summe(double d, RadioButton rb) {

		if (rb.isSelected() == false)
			s = s - d;

		if (rb.isSelected())
			s = s + d;

		s = Math.round(s * 100.0) / 100.0;
		ausgabe = Double.toString(s);
		SummefeldHS.setText(ausgabe + "0 Euro");
		SummenfeldBL.setText(ausgabe + "0 Euro");
		SummenfeldGetraenk.setText(ausgabe + "0 Euro");

	}

	public void PreisberechnenHS(ActionEvent e) {

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Menue1"): {

			summeGroup(2.0, rb);
			break;

		}

		case ("Menue2"): {

			summeGroup(2.1, rb);

			break;

		}

		case ("Menue3"): {

			summeGroup(1.9, rb);
			break;

		}
		}

	}

	public void PreisberechnenBL(ActionEvent e) {

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

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

		}
		case ("Fanta"): {

			summe(1.0, rb);
			break;

		}

		case ("Cola"): {

			summe(1.0, rb);
			break;

		}

		case ("Spezi"): {

			summe(1.0, rb);
			break;

		}

		case ("Sprite"): {

			summe(1.0, rb);
			break;

		}

		case ("Apfelsaft"): {

			summe(0.9, rb);
			break;

		}

		case ("CapriSonne"): {

			summe(0.5, rb);
			break;

		}

		case ("RedBull"): {

			summe(2.0, rb);
			break;

		}

		case ("Wasser"): {

			summe(0.5, rb);
			break;

		}

		case ("Ayran"): {

			summe(0.5, rb);
			break;

		}

				}

	}
}
