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
	private RadioButton Rahmso√üe;

	@FXML
	private RadioButton Jaegerso√üe;

	@FXML
	private RadioButton Bratenso√üe;

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
	void zurHauptspeiseOnClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(hauptspeiseTab);
	}
	
	@FXML
	void meineBestellungWindowOnClick(ActionEvent event) {

		try 
		{
			FXMLLoader order = new FXMLLoader(getClass().getResource("MYORDER.fxml"));
			Parent root = (Parent) order.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		//Fenster nach verlassen schlieﬂen
		Stage close = (Stage) meineBestellungBtn.getScene().getWindow();
	    close.close();
	}
	
	
	@FXML
	void meineBestellungZurueckBtnOnClicked(ActionEvent event) {

		try 
		{
			FXMLLoader order = new FXMLLoader(getClass().getResource("GUI.fxml"));
			Parent root = (Parent) order.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		//Fenster nach verlassen schlieﬂen
		Stage close = (Stage) meineBestellungZurueckBtn.getScene().getWindow();
	    close.close();
	}
	
	@FXML
	void bezahlenOnClicked(ActionEvent event) {

		try 
		{
			FXMLLoader order = new FXMLLoader(getClass().getResource("PAY.fxml"));
			Parent root = (Parent) order.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		//Fenster nach verlassen schlieﬂen
		Stage close = (Stage) bezahlenBtn.getScene().getWindow();
	    close.close();
	}
	
	@FXML
	void bezahlungBeendenBtnOnClicked(ActionEvent event) {

		try 
		{
			FXMLLoader order = new FXMLLoader(getClass().getResource("GUI.fxml"));
			Parent root = (Parent) order.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		//Fenster nach verlassen schlieﬂen
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
		SummefeldHS.setText(endsummeHaupt + "0 Ä");

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
		SummenfeldBL.setText(endsummeBL + "0 Ä");

	}

	public void PreisberechnenSosse(ActionEvent e) {

		double summeSosse = summeInsgesamt;
		String endsummeSosse = " ";

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Rahmsoﬂe"):

			if (rb.isSelected() == false)
				summeSosse = summeSosse - 0.7;

			if (rb.isSelected())
				summeSosse = summeSosse + 0.7;
			break;

		}

		switch (name) {

		case ("Jaegersoﬂe"):

			if (rb.isSelected() == false)
				summeSosse = summeSosse - 0.8;

			if (rb.isSelected())
				summeSosse = summeSosse + 0.8;
			break;

		}

		switch (name) {

		case ("Bratensoﬂe"):

			if (rb.isSelected() == false)
				summeSosse = summeSosse - 0.7;

			if (rb.isSelected())
				summeSosse = summeSosse + 0.7;
			break;

		}

		summeSosse = Math.round(summeSosse * 100.0) / 100.0;
		endsummeSosse = Double.toString(summeSosse);
		SummenfeldBL.setText(endsummeSosse + "0 Ä");

	}

}
