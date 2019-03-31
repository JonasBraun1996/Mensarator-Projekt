package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class footerController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	} 
	
    @FXML
    private TextArea SummefeldHS;
    
    public void setSummefeldHS(String price) {
    	SummefeldHS.setText(price);
    	
	}	

}
