package getraenke;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Summe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
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
	
	@FXML 
	private ToggleButton IceCubes;
	
	Pane center;
	
	ObservableList<String> wateroptions = FXCollections.observableArrayList("Still", "Medium", "Classic");
	ObservableList<String> sizeoptions = FXCollections.observableArrayList("0,33 l", "0,50 l", "1,00 l");
	
	@FXML
	private ComboBox<String> wasser;
	
	@FXML
	private ComboBox<String> size;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			center = FXMLLoader.load(getClass().getResource("/warenkorb/warenkorb.fxml"));
			
			//ComboBox Wasser
			wasser.setValue("Still");
			wasser.setItems(wateroptions);
			
			//ComboBox Groeﬂe
			size.setValue("0,33 l");
			size.setItems(sizeoptions);
			 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	    
	@FXML
    void weiterZuWarenkorb(ActionEvent event) {
		rootGetraenke.setCenter(center);
    }
	
	@FXML
	void Eiswuerfel(ActionEvent event) {
		ToggleButton tb = (ToggleButton) event.getSource();
		Summe.oneup(1, tb);
		SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
	}
	
	@FXML
	private TextField SummenfeldGetr;

	@FXML Button getraenkeZurueck;
	
	@FXML
	void PreisberechnenGr(ActionEvent e) {

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Ayran"): {
			Summe.changeSumme(0.50, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}

		case ("RedBull"): {
			Summe.changeSumme(2.00, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}

		case ("CapriSonne"): {
			Summe.changeSumme(0.50, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}

		case ("Apfelsaft"): {
			Summe.changeSumme(0.90, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}

		case ("Sprite"): {
			Summe.changeSumme(1.00, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}

		case ("Wasser"): {
			Summe.changeSumme(0.50, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}

		case ("Fanta"): {
			Summe.changeSumme(1.00, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}

		case ("Spezi"): {
			Summe.changeSumme(1.00, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}

		case ("Cola"): {
			Summe.changeSumme(1.00, rb);
			SummenfeldGetr.setText(Double.toString(Summe.getSumme()) + "0 Ä");
			break;
		}
		}
	}
}
