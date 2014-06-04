import java.util.*;
public class Vorhersage implements Observer {
	public Vorhersage(){}
	
	@Override
	public void update(Observable observable, Object arg) {
		System.out.println("hier folgt die aktuelle Vorhersage");
		
	}

}
