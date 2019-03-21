package footer;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class Controllerfooter implements Initializable{
	
	@FXML
	private AnchorPane footer;
	
	@FXML
	private  TextArea Summenfeld;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		// TODO Auto-generated method stub

		footer.setMaxWidth(Double.MAX_VALUE);
		
		
	
	}

	

}
