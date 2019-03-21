package startseite;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controllerstartseite  {

	@FXML
	public TabPane tabPane;

	@FXML
	private Button startseite;

	@FXML
	public Tab Startseite;

	
	 @FXML public Tab StartseiteTab;
	 /*
	  * 
	 * 
	 * @FXML private ToggleGroup menue;
	 * 
	 * @FXML private Button meineBestellungZurueckBtn;
	 * 
	 * @FXML private Button bezahlungBeendenBtn;
	 * 
	 * @FXML private Button meineBestellungBtn;
	 * 
	 * @FXML private Button konfigStartenBtn;
	 * 
	 * @FXML private Button bezahlenBtn;
	 * 
	 * @FXML public Tab warenkorbTab;
	 * 
	 * @FXML private Button bezahlen;
	 * 
	 * @FXML private Button warenkorbZurueck;
	 * 
	 * 
	 */

	// Komponenten
	 
	 /*
	
	}

	@FXML
	void zurHauptspeiseOnClicked(ActionEvent event) {

		tabPane.getSelectionModel().select(tabHauptspeise);
	}

	
	 * @FXML void meineBestellungWindowOnClick(ActionEvent event) {
	 * 
	 * try { FXMLLoader order = new
	 * FXMLLoader(getClass().getResource("MYORDER.fxml")); Parent root = (Parent)
	 * order.load(); Stage stage = new Stage(); stage.setScene(new Scene(root));
	 * stage.show();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * // Fenster nach verlassen schliessen Stage close = (Stage)
	 * meineBestellungBtn.getScene().getWindow(); close.close();
	 * 
	 * }
	 * 
	 * @FXML void meineBestellungZurueckBtnOnClicked(ActionEvent event) {
	 * 
	 * try { FXMLLoader order = new FXMLLoader(getClass().getResource("GUI.fxml"));
	 * Parent root = (Parent) order.load(); Stage stage = new Stage();
	 * stage.setScene(new Scene(root)); stage.show();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * // Fenster nach verlassen schlie�en Stage close = (Stage)
	 * meineBestellungZurueckBtn.getScene().getWindow(); close.close(); }
	 * 
	 * @FXML void bezahlenOnClicked(ActionEvent event) {
	 * 
	 * try { FXMLLoader order = new FXMLLoader(getClass().getResource("PAY.fxml"));
	 * Parent root = (Parent) order.load(); Stage stage = new Stage();
	 * stage.setScene(new Scene(root)); stage.show();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * // Fenster nach verlassen schlie�en Stage close = (Stage)
	 * bezahlenBtn.getScene().getWindow(); close.close(); }
	 * 
	 * @FXML void bezahlungBeendenBtnOnClicked(ActionEvent event) {
	 * 
	 * try { FXMLLoader order = new FXMLLoader(getClass().getResource("GUI.fxml"));
	 * Parent root = (Parent) order.load(); Stage stage = new Stage();
	 * stage.setScene(new Scene(root)); stage.show();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * // Fenster nach verlassen schlie�en Stage close = (Stage)
	 * bezahlungBeendenBtn.getScene().getWindow(); close.close(); }
	 * 
	 * @FXML void WarenkorbZurueckClicked(ActionEvent event) {
	 * 
	 * tabPane.getSelectionModel().select(getraenkeTab);
	 * 
	 * }
	 * 
	 * 
	 */

}
