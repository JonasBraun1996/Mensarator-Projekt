package client;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Controllerclient implements Initializable{
	
	@FXML
	private BorderPane borderPane;

	@FXML
	private static TabPane Pane;


	public void initialize (URL arg0, ResourceBundle arg1) {

		try {
			
			
		MenuBar menubar = FXMLLoader.load(getClass().getResource("/menubar/menubar.fxml"));
		borderPane.setTop(menubar);


		AnchorPane footer = FXMLLoader.load(getClass().getResource("/footer/footer.fxml"));
		borderPane.setBottom(footer);

		Tab tabHauptspeise = FXMLLoader.load(getClass().getResource("/hauptspeise/hauptspeise.fxml"));
		Pane.getTabs().add(tabHauptspeise);
		
		Tab tabBeilage = FXMLLoader.load(getClass().getResource("/beilage/beilage.fxml"));
		Pane.getTabs().add(tabBeilage);
		
		Tab tabGetraenke = FXMLLoader.load(getClass().getResource("/getraenk/getraenk.fxml"));
		Pane.getTabs().add(tabGetraenke);
		
		
			
			

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	
	
	
	
	
	

}

}