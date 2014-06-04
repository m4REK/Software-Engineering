import java.util.*;


public class Wetterstation extends Observable {
	private MessDaten daten = new MessDaten();

	// wird aufgerufen, wenn neue Messwerte da sind
	public void messwerteGeaendert(){
		setChanged();
		notifyObservers(daten);
	}

	
	// Simulation der Wetterdaten ...
	public void messungSimulieren(){
		Thread thread = new Thread(new Runnable(){
			public void run(){
				while (true){
					daten.messen();
					messwerteGeaendert();
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		thread.start();
	}

	public Wetterstation(){
		messungSimulieren();
	}
}
