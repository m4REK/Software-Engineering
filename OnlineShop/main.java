public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artikel USB = new Artikel("USB Stick", 19.99);
		Artikel Festplatte = new Artikel("Festplatte", 89.99);
		Artikel Mauspad = new Artikel("Mousepad", 3.33);

		Rechnung rn1 = new Rechnung();

		rn1.addArtikel(USB);
		rn1.addArtikel(Festplatte);
		rn1.addArtikel(Mauspad);

		txtFormat txt = new txtFormat();
		htmlFormat html = new htmlFormat();

		rn1.setDruckerStrategy(txt);
		rn1.setDruckerStrategy(html);

	}
}
