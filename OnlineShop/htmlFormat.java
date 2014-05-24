import java.util.ArrayList;
import java.util.ListIterator;

public class htmlFormat implements Format {

	@Override
	public void drucken(ArrayList<Artikel> liste) {
		ListIterator<Artikel> li = liste.listIterator();
		System.out.println("<table>\n\t<tr>\n\t\t<td>Artikel : Preis</td>");
		while (li.hasNext()) {
			System.out.println("\t\t <td> " + li.next() + " </td>\n");
		}
		System.out.println("\t</tr>\n</table>");

	}
}
