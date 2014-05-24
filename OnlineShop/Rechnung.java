public class Rechnung {
	private ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
	private Format druckStrategy;

	public void addArtikel(Artikel artikel) {
		artikelListe.add(artikel);
	}

	public void setDruckerStrategy(Format startegy) {
		this.druckStrategy = startegy;
		druckStrategy.drucken(artikelListe);
	}

}
