public class Main {

	public static void main(String[] args) {
		Teilnehmer marko = new Teilnehmer("Marko Vukadinovic",
				"vukadinovic.m@live.com", "Student");
		System.out.println(marko.toString());

		Teilnehmer massimo = new Teilnehmer("Massimo De Bilio",
				"massi@mail.de", "Privatperson");

		Workshops wShops = new Workshops("Workshop New-Ideas", "22.03.2014");
		wShops.addTeilnehmer(marko);
		wShops.addTeilnehmer(new Teilnehmer("Giulia De Bilio",
				"giuliett@gmx.de", "Privatperson"));
		System.out.println(wShops.toString());

		Referenten referent = new Referenten("Andreas Plass",
				"andreas.plass@haw-hamburg.de", "HAW-HAMBURG");
		referent.addWorkshop(new Workshops("Mobile Games", "11.08.2014"));
		System.out.println(referent.toString());

		Rahmenprogramme rpMusical = new Rahmenprogramme("Musical", "22.6.2014",
				"11:30", "Hamburg");
		rpMusical.addTeilnehmer(marko);
		rpMusical.addTeilnehmer(massimo);
		System.out.println(rpMusical.toString());

	}
}
