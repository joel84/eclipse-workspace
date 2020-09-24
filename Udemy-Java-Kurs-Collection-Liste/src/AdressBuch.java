import java.util.ArrayList;
import java.util.Scanner;

public class AdressBuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Objekte erstellen
		
		Adresse peterAdresse = new Adresse("Peter", "Fritzlangen.4", "Berlin");
		Adresse hansAdresse = new Adresse("Hans", "Berlinerstra�e.6", "Leipzig");
		Adresse michaelAdresse = new Adresse("Michael", "Leipzigerstra�e.40", "Hamburg");
		
		//Datentrukturen
		
		ArrayList<Adresse> adressenListe = new ArrayList<Adresse>();
		Adresse [] adresseArray = {peterAdresse,hansAdresse,michaelAdresse};
		
		
		//Eingabe in Liste
		
		adressenListe.add(peterAdresse);
		adressenListe.add(hansAdresse);
		adressenListe.add(michaelAdresse);
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String stra�e = scan.nextLine();
		String stadt = scan.nextLine();
		
		Adresse adresse4 = new Adresse(name, stra�e, stadt);
		adressenListe.add(adresse4);
		
		System.out.println("Arraylist");
		//Ausgabe der Liste
		for (Adresse adresse : adressenListe) {
			System.out.println("Name: " + adresse.getName() + " ; Stra�e: " + adresse.getStra�e() + " ; Stadt: " + adresse.getStadt());
		}
		
		System.out.println("Array");
		for (Adresse adresse : adresseArray) {
			System.out.println("Name: " + adresse.getName() + " ; Stra�e: " + adresse.getStra�e() + " ; Stadt: " + adresse.getStadt());
		}
	}

}
