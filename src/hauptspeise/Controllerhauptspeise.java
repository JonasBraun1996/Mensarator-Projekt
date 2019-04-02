package hauptspeise;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Summe;
import beilage.Controllerbeilage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
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
	private TextField Summenfeld;
	
	@FXML
	private ToggleGroup menue;
	
    @FXML
    private ImageView Beins;

    @FXML
    private ImageView Bzwei;

    @FXML
    private ImageView Bdrei;
	
	public static Controllerbeilage cb;
	
	public TextField getTxtMain() {
		return Summenfeld;
	}
	
	public void setTxtMain(TextField txtMain) {
		this.Summenfeld = txtMain;
	}	

	@FXML
	private BorderPane rootHauptspeise;

	Pane center;
	Pane back;
	Pane reset;
	Pane footer;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			center = FXMLLoader.load(getClass().getResource("/beilage/beilagePane.fxml"));
			final Tooltip tooltipBildzwei = new Tooltip();
			tooltipBildzwei.setText("Vegetarisch");
			Menue2.setTooltip(tooltipBildzwei);
			final Tooltip tooltipBilddrei = new Tooltip();
			tooltipBilddrei.setText("Vegan");
			Menue3.setTooltip(tooltipBilddrei);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static Controllerbeilage controller1;
	
	@FXML
	void weiterZuBeilage(ActionEvent event) {
		rootHauptspeise.setCenter(center);	
	}
	
	public void PreisberechnenHS(ActionEvent e) {

		RadioButton rb = (RadioButton) e.getSource();
		String name = rb.getId();

		switch (name) {

		case ("Menue1"): {
			Summe.resetSumme();
			Summe.changeSumme(2.0, rb);
			TextField Summefeld = getTxtMain();
			Summefeld.setText("2.00 €");
			break;
		}

		case ("Menue2"): {
			Summe.resetSumme();
			Summe.changeSumme(2.1, rb);
			TextField Summefeld = getTxtMain();
			Summefeld.setText("2.10 €");
			break;
		}

		case ("Menue3"): {
			Summe.resetSumme();
			Summe.changeSumme(1.9, rb);
			TextField Summefeld = getTxtMain();
			Summefeld.setText("1.90 €");
			break;
		}
		}
	}
}
