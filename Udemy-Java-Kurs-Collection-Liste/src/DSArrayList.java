import java.util.ArrayList;

public class DSArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList einkaufsListe = new ArrayList();
		ArrayList<String> namensListe = new ArrayList<String>();

		einkaufsListe.add("Wasser");
		einkaufsListe.add("Wasser");
		// einkaufsListe.add(new Integer(4));

		namensListe.add("Hans");
		namensListe.add("Peter");
		//namensListe.contains("Hans");               returns a boolean saying whether the namensListe contains "Hans"

		for (int i = 0; i < namensListe.size(); i++) {
			System.out.println("Name:" + namensListe.get(i));
		}

		for (String string : namensListe) {
			System.out.println("Die Länge des Names ist: " + string.length());
		}
	}

}
