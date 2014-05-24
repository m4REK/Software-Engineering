public class Artikel {
	private String artikelBeschreibung;
	private double artikelPreis;

	public Artikel(String name, double preis) {
		this.artikelBeschreibung = name;
		this.artikelPreis = preis;
	}

	public String toString() {
		return artikelBeschreibung + " : " + artikelPreis;
	}
}
