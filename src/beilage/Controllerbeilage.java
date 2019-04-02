package beilage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Summe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Controllerbeilage implements Initializable {

	@FXML
	public Tab beilageTab;

	@FXML
	private Button beilageWeiter;

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
	private BorderPane rootBeilage;

	@FXML
	private TextField SummenfeldBeilage;

	Pane center;

	@FXML
	void preisholen(ActionEvent event) {
		SummenfeldBeilage.setText(Double.toString(Summe.getSumme()));
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			center = FXMLLoader.load(getClass().getResource("/getraenke/getraenkePane.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void weiterZuGetraenke(ActionEvent event) {
		rootBeilage.setCenter(center);
	}

	@FXML
	void PreisberechnenBL(ActionEvent e) {

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Pommes"): {
			Summe.changeSumme(1.50, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Reis"): {
			Summe.changeSumme(1.10, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Spaetzle"): {
			Summe.changeSumme(1.30, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Kroketten"): {
			Summe.changeSumme(1.50, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Suppe"): {
			Summe.changeSumme(1.00, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Nudeln"): {
			Summe.changeSumme(1.20, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Gemuese"): {
			Summe.changeSumme(1.20, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Salat"): {
			Summe.changeSumme(1.50, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Kartoffelbrei"): {
			Summe.changeSumme(1.60, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Popcorn"): {
			Summe.changeSumme(1.60, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}
		
		case ("Rahmsosse"): {
			Summe.changeSumme(0.70, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Jaegersosse"): {
			Summe.changeSumme(0.80, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}

		case ("Bratensosse"): {
			Summe.changeSumme(0.70, rb);
			SummenfeldBeilage.setText(Double.toString(Summe.getSumme()) + "0 €");
			break;
		}
		}
	}
}
