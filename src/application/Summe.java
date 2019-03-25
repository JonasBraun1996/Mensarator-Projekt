package application;

public class Summe {
	public static double Summe = 0.00;
	
	public static double getSumme() {
		return Summe;
	}
	
	public static void changeSumme(double change) {
		Summe = Summe + change;
	}
}
