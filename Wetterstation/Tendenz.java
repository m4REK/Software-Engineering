import java.util.*;
public class Tendenz implements Observer{
	private int lastTemp;
	private int lastFeucht;
	private int lastDruck;
	

	
	public Tendenz(){}
	@Override
	public void update(Observable observable, Object arg) {
		MessDaten daten = (MessDaten)arg;
		int temp = daten.getTemperatur();
		int feucht = daten.getFeuchtigkeit();
		int druck = daten.getDruck();

		System.out.print("Tendenz: ");

		if (temp >= lastTemp){
			System.out.print("Temp + ");
		}
		else {
			System.out.print("Temp - ");
		}
		
		if (feucht >= lastFeucht){
			System.out.print("Feucht + ");
		}
		else {
			System.out.print("Feucht - ");
		}
		
		if (druck >= lastDruck){
			System.out.println("Druck + ");
		}
		else {
			System.out.println("Druck - ");
		}
		
		lastTemp = temp;
		lastFeucht = feucht;
		lastDruck = druck;
	}

}
