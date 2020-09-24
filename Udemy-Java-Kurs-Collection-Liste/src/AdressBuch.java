import java.util.ArrayList;
import java.util.Scanner;

public class AdressBuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Objekte erstellen
		
		Adresse peterAdresse = new Adresse("Peter", "Fritzlangen.4", "Berlin");
		Adresse hansAdresse = new Adresse("Hans", "Berlinerstraße.6", "Leipzig");
		Adresse michaelAdresse = new Adresse("Michael", "Leipzigerstraße.40", "Hamburg");
		
		//Datentrukturen
		
		ArrayList<Adresse> adressenListe = new ArrayList<Adresse>();
		Adresse [] adresseArray = {peterAdresse,hansAdresse,michaelAdresse};
		
		
		//Eingabe in Liste
		
		adressenListe.add(peterAdresse);
		adressenListe.add(hansAdresse);
		adressenListe.add(michaelAdresse);
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String straße = scan.nextLine();
		String stadt = scan.nextLine();
		
		Adresse adresse4 = new Adresse(name, straße, stadt);
		adressenListe.add(adresse4);
		
		System.out.println("Arraylist");
		//Ausgabe der Liste
		for (Adresse adresse : adressenListe) {
			System.out.println("Name: " + adresse.getName() + " ; Straße: " + adresse.getStraße() + " ; Stadt: " + adresse.getStadt());
		}
		
		System.out.println("Array");
		for (Adresse adresse : adresseArray) {
			System.out.println("Name: " + adresse.getName() + " ; Straße: " + adresse.getStraße() + " ; Stadt: " + adresse.getStadt());
		}
	}

}
