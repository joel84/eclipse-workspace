import java.util.*;


class VergleicheStringLaenge implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
        int laenge1 = o1.length();
		int laenge2 = o2.length();
		
		if (laenge1 > laenge2) {
			return 1;
		} else if (laenge1 < laenge2) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

// 1 = o1 ist größer als 02
// -1 = o1 ist kleiner als o2
// 0 = beide gleich


class UmgekehrteAlphabetischeReihenfolge implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
	
}

public class Zusammenfassung2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> angestellteListe = new ArrayList<String>();
		
		angestellteListe.add("Hans");
		angestellteListe.add("Berndwerne");
		angestellteListe.add("Andi");
		angestellteListe.add("Petrawerw");
		angestellteListe.add("Peter");
		angestellteListe.add("Christian");
		
		Collections.sort(angestellteListe, new UmgekehrteAlphabetischeReihenfolge());
		
		for (String string : angestellteListe) {
			System.out.println(string);
		}
	}

}
