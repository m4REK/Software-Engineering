import java.util.ArrayList;

public class Rahmenprogramme {
	private String rpBezeichnung;
	private String rpDatum;
	private String rpZeit;
	private String rpOrt;
	private ArrayList<Teilnehmer> teilnehmerListe;

	public Rahmenprogramme(String bezeichnung, String datum, String zeit,
			String ort) {
		this.rpBezeichnung = bezeichnung;
		this.rpDatum = datum;
		this.rpZeit = zeit;
		this.rpOrt = ort;
		this.teilnehmerListe = new ArrayList<Teilnehmer>();
	}

	public void addTeilnehmer(Teilnehmer teilnehmer) {
		teilnehmerListe.add(teilnehmer);
	}

	public String getRpBezeichnung() {
		return rpBezeichnung;
	}

	public void setRpBezeichnung(String rpBezeichnung) {
		this.rpBezeichnung = rpBezeichnung;
	}

	public String getRpDatum() {
		return rpDatum;
	}

	public void setRpDatum(String rpDatum) {
		this.rpDatum = rpDatum;
	}

	public String getRpZeit() {
		return rpZeit;
	}

	public void setRpZeit(String rpZeit) {
		this.rpZeit = rpZeit;
	}

	public String getRpOrt() {
		return rpOrt;
	}

	public void setRpOrt(String rpOrt) {
		this.rpOrt = rpOrt;
	}

	public ArrayList<Teilnehmer> getTeilnehmerListe() {
		return teilnehmerListe;
	}

	@Override
	public String toString() {
		return "Rahmenprogramme [" + getRpBezeichnung() + ", " + getRpDatum()
				+ ", " + getRpZeit() + ", " + getRpOrt() + getTeilnehmerListe()
				+ "]";
	}

}
