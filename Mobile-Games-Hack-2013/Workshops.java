import java.util.ArrayList;

public class Workshops {
	private String workshopName;
	private String Datum;
	private ArrayList<Teilnehmer> teilnehmerListe;

	public Workshops(String name, String datum) {
		this.workshopName = name;
		this.Datum = datum;
		this.teilnehmerListe = new ArrayList<Teilnehmer>();

	}

	public void addTeilnehmer(Teilnehmer teilnehmer) {
		teilnehmerListe.add(teilnehmer);
	}

	public String getWorkshopName() {
		return workshopName;
	}

	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}

	public String getDatum() {
		return Datum;
	}

	public void setDatum(String datum) {
		Datum = datum;
	}

	@Override
	public String toString() {
		return "Workshop [" + getWorkshopName() + ", " + Datum + ", "
				+ teilnehmerListe + "]";
	}

}