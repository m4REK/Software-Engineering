public class txtFormat implements Format {

	@Override
	public void drucken(ArrayList<Artikel> liste) {
		ListIterator<Artikel> li = liste.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());

		}

	}
}
