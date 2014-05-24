public class Teilnehmer {
	private String teilnehmetName;
	private String teihlnehmerEmail;
	private String teilnehmerStatus;

	public Teilnehmer(String name, String email, String status) {
		this.teilnehmetName = name;
		this.teihlnehmerEmail = email;
		this.teilnehmerStatus = status;
	}

	public String getTeilnehmetName() {
		return teilnehmetName;
	}

	public String getTeihlnehmerEmail() {
		return teihlnehmerEmail;
	}

	public String getTeilnehmerStatus() {
		return teilnehmerStatus;
	}

	@Override
	public String toString() {
		return "Teilnehmer [" + getTeilnehmetName() + ", "
				+ getTeihlnehmerEmail() + ", " + getTeilnehmerStatus() + "]";
	}

}
