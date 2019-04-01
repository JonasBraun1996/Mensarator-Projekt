package hauptspeise;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Summe;
import application.footerController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Controllerhauptspeise implements Initializable {

	@FXML
	public Tab hauptspeiseTab;

	@FXML
	private Button hauptspeiseWeiter;

	@FXML
	private RadioButton Menue1;

	@FXML
	private RadioButton Menue2;

	@FXML
	private RadioButton Menue3;

	@FXML
	private ToggleGroup menue;

	@FXML
	private BorderPane rootHauptspeise;

	Pane center;
	Pane back;
	Pane reset;

	@FXML
	public static footerController fc;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			FXMLLoader loaderController = new FXMLLoader(getClass().getResource("hauptspeise/hauptspeise2.fxml"));
			center = FXMLLoader.load(getClass().getResource("/beilage/beilagePane.fxml"));
			fc = loaderController.getController();
		
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@FXML
	void weiterZuBeilage(ActionEvent event) {

		rootHauptspeise.setCenter(center);
	}

	double summe=0;
	
	public void PreisberechnenHS(ActionEvent e) {

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Menue1"): {
			
			Summe.resetSumme();
			Summe.changeSumme(2.0, rb);
			application.footerController.setSumme(Summe.getSumme());
			
			

			break;

		}

		case ("Menue2"): {
			Summe.resetSumme();
			Summe.changeSumme(2.1, rb);
			System.out.println(Summe.getSumme());
			break;

		}

		case ("Menue3"): {
			Summe.resetSumme();
			Summe.changeSumme(1.9, rb);
			break;

		}
		}
	}
	
}
