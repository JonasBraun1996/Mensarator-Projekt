package application;

import java.net.URL;
import java.util.ResourceBundle;

import hauptspeise.Controllerhauptspeise;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class footerController implements Initializable{
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	} 
	
    @FXML
    private static TextArea SummefeldHS;
    
  
    
    public static void setSumme(double p) {
		 
		 String preis=Double.toString(Summe.getSumme());
		 SummefeldHS.setText(preis);
	
		 

}

}
