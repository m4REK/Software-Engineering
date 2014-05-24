import java.util.ArrayList;

public class Referenten {
	private String refName;
	private String refEmail;
	private String refFirma;
	private ArrayList<Workshops> angebotenesWorkshop;

	public Referenten(String name, String email, String firma) {
		this.refName = name;
		this.refEmail = email;
		this.refFirma = firma;
		this.angebotenesWorkshop = new ArrayList<Workshops>();

	}

	public void addWorkshop(Workshops angebot) {
		angebotenesWorkshop.add(angebot);
	}

	public String getRefName() {
		return refName;
	}

	public String getRefEmail() {
		return refEmail;
	}

	public String getRefFirma() {
		return refFirma;
	}

	public ArrayList<Workshops> getAngebotenesWorkshop() {
		return angebotenesWorkshop;
	}

	@Override
	public String toString() {
		return "Referent [" + getRefName() + ", " + getRefEmail() + ", "
				+ getRefFirma() + ", " + getAngebotenesWorkshop() + "]";
	}

}
