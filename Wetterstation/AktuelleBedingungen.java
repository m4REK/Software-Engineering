import java.util.*;
public class AktuelleBedingungen implements Observer{
	
	public AktuelleBedingungen(){}
	@Override
	public void update(Observable observable, Object arg) {
		MessDaten daten = (MessDaten) arg;
		System.out.println("aktuell: " 
				+ daten.getTemperatur() + " C " 
				+ daten.getFeuchtigkeit() + "% "
				+ daten.getDruck() + " hPa ");
	}
}
