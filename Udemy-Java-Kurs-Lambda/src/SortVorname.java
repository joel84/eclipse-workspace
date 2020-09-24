import java.util.Comparator;

public class SortVorname implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getVorname().compareToIgnoreCase(o2.getVorname());
	}

}
