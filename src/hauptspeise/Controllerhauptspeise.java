package hauptspeise;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

public class Controllerhauptspeise implements Initializable{

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
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			center = FXMLLoader.load(getClass().getResource("/beilage/beilagePane.fxml"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			

	}
	
	 @FXML
	 void weiterZuBeilage(ActionEvent event) {	

		 rootHauptspeise.setCenter(center);				
	 }
	
	
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

	

	

}
