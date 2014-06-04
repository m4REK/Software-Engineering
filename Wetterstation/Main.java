
public class Main {
	public static void main(String[] arg){
		Wetterstation wetterstation = new Wetterstation();
		AktuelleBedingungen aktuelleBedingungen = new AktuelleBedingungen();
		Tendenz tendenz = new Tendenz();
		Vorhersage vorhersage = new Vorhersage();
		wetterstation.addObserver(aktuelleBedingungen);
		wetterstation.addObserver(tendenz);
		wetterstation.addObserver(vorhersage);
	}
}
