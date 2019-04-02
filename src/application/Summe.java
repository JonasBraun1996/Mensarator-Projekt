package application;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;

public class Summe {
	public static double Summe = 0.00;
	
	public static double getSumme() {
		return Summe;
	}
	
	public static void changeSumme(double change, RadioButton rb) {
		double temp;
		if(rb.isSelected()) {
			
			temp = Summe + change;
		}else {
			temp = Summe - change;
		}
			
		
		Summe = Math.round(temp * 100.0) / 100.0;		
		
		
	}
	
	public static void oneup(double change, ToggleButton tb) {
		
		if(tb.isSelected()) {
			Summe = Summe + change;
		}else {
			Summe = Summe - change;
		}
	}
	
	public static void resetSumme() {
		Summe = 0;
	}
	
	
}
