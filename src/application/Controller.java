package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

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
    private Button beilageWeiter;

    @FXML
    private Button beilageZurueck;

    @FXML
    private Tab getraenkeTab;

    @FXML
    private Button getraenkeWeiter;

    @FXML
    private Button getraenkeZurueck;

    @FXML
    private Tab warenkorbTab;

    @FXML
    private Button bezahlen;

    @FXML
    private Button warenkorbZurueck;

    @FXML
    void hauptspeiseWeiterClicked(ActionEvent event) {

    	tabPane.getSelectionModel().select(beilageTab);   	    	
    	
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

}
