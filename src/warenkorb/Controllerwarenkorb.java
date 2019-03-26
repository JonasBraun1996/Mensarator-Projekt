package warenkorb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Controllerwarenkorb implements Initializable{
    
    @FXML
    private BorderPane rootWarenkorb;

    Pane center;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }

    @FXML
    void zurueckZurStartseite(ActionEvent event) {
    	
    	try {
    		center = FXMLLoader.load(getClass().getResource("/application/AllInOne.fxml"));
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	rootWarenkorb.setCenter(center);
    }

}
