import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PersonList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> personsList = Person.createShortList();
		
		for (Person person : personsList) {
			person.getPersonData();
		}
		
		System.out.println("____");
		
		//Vorname sortieren
		Collections.sort(personsList, new SortVorname());
		
		for (Person person : personsList) {
			person.getPersonData();
		}
		
		System.out.println("____");
		
		//Nachname sortieren
		Collections.sort(personsList, new SortNachname());
		
		for (Person person : personsList) {
			person.getPersonData();
		}
		
		System.out.println("____");
		
		//Anonyme Klasse zum sortieren nutzen
		Collections.sort(personsList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getVorname().compareToIgnoreCase(o2.getVorname());
			}
		});
		
		for (Person person : personsList) {
			person.getPersonData();
		}
		
		System.out.println("____");
		
		//Lambda
		Collections.sort(personsList, (p1,p2) -> p1.getVorname().compareToIgnoreCase(p2.getVorname()));
		

		for (Person person : personsList) {
			person.getPersonData();
		}
	}

}
