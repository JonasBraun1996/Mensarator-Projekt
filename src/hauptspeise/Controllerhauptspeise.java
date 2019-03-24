package hauptspeise;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import client.Controllerclient;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import startseite.Controllerstartseite;

public class Controllerhauptspeise {

	@FXML
	public Tab hauptspeiseTab;

	@FXML
	private Button hauptspeiseWeiter;

	@FXML
	private Button startseite;

	@FXML
	private RadioButton Menue1;

	@FXML
	private RadioButton Menue2;

	@FXML
	private RadioButton Menue3;

	@FXML
	private ToggleGroup menue;

	

	public void PreisberechnenHS(ActionEvent e) {

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		 switch (name) {
		  
		 case ("Menue1"): {
		  
//		 Main.summeGroup(2.0, rb);
		 break;
		 
		 }
		
		  case ("Menue2"): {
		  
//		  Main.summeGroup(2.1, rb);
		  
		  break;
		  
		  }
		  
		  case ("Menue3"): {
		  
//		  Main.summeGroup(1.9, rb); break;
		  
		  } }
		 

	}

	@FXML
	void hauptspeiseWeiterClicked(ActionEvent event) {

		// tabPane.getSelectionModel().select(tabBeilage);

	}

	@FXML
	void ZurueckZurStartseite(ActionEvent event) {

		// tabPane.getSelectionModel().select(tabStartseite);

	}

}
