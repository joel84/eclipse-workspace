import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


class SortiereAngestelltenID implements Comparator<Angestellter> {

	@Override
	public int compare(Angestellter o1, Angestellter o2) {
		// TODO Auto-generated method stub
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

class SortiereAngestelltenName implements Comparator<Angestellter> {

	@Override
	public int compare(Angestellter o1, Angestellter o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SortiereAngestelltenGeburtsjahr implements Comparator<Angestellter>{

	@Override
	public int compare(Angestellter o1, Angestellter o2) {
		// TODO Auto-generated method stub
		if (o1.getGeburtsJahr() > o2.getGeburtsJahr()) {
			return 1;
		} else if (o1.getGeburtsJahr() < o2.getGeburtsJahr()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

public class AngestellteListen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Angestellter> angestelltenListe = new ArrayList<>();
		
		AngestellteListen2.addAngestellter(3, angestelltenListe);
		
		Collections.sort(angestelltenListe, new SortiereAngestelltenName());
		
		AngestellteListen2.getAngestellter(angestelltenListe);
		
		Set<Angestellter> set1 = new TreeSet<Angestellter>(new SortiereAngestelltenGeburtsjahr());
		Map<Angestellter, String> map1 = new TreeMap<Angestellter, String>(new SortiereAngestelltenID());
	}

	
	public static void addAngestellter (int anzahl , Collection<Angestellter> col) {
		for (int i = 1; i <= anzahl; i++) {
			Scanner scanAngestellter = new Scanner(System.in);
			System.out.println("Bitte Name eintippen : ");
			String name = scanAngestellter.nextLine();
			System.out.println("Bitte ID eintippen : ");
			int id = scanAngestellter.nextInt();
			System.out.println("Bitte Geburtsjahr eintippen : ");
			int geburtsJahr = scanAngestellter.nextInt();
			
			Angestellter angestellter = new Angestellter(id, name, geburtsJahr);
			col.add(angestellter);
		}
	}
	
	public static void getAngestellter (Collection<Angestellter> col) {
		for (Angestellter angestellter : col) {
			System.out.print("Angestellter");
			System.out.println(angestellter);
		}
	}
}
