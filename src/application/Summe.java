package application;

import javafx.scene.control.RadioButton;

public class Summe {
	public static double Summe = 0.00;
	
	public static double getSumme() {
		return Summe;
	}
	
	public static void changeSumme(double change, RadioButton rb) {
		if(rb.isSelected()) {
			Summe = Summe + change;
		}else {
			Summe = Summe - change;
		}
	}
	
	public static void resetSumme() {
		Summe = 0;
	}
	
	public String toString() {
		String summe = Summe + "0";
		return summe;
	}
}
