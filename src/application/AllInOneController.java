package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class AllInOneController implements Initializable{

	    @FXML
	    private Pane StartSeite;

	    @FXML
	    private Button startConfiguration;

		@FXML
		private BorderPane root;
		
		Pane footer;
		Pane center;
		static int counter = 0;
	
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
	
			try {
			center = FXMLLoader.load(getClass().getResource("/hauptspeise/hauptspeise2.fxml"));
			
			footer = FXMLLoader.load(getClass().getResource("/application/footer.fxml"));
			
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}

	}
		@FXML
	    void start(ActionEvent event) {
				counter=counter +1;
				root.setCenter(center);
				if(counter == 1) {
					root.setBottom(footer);
				}
				
		}
		

}
