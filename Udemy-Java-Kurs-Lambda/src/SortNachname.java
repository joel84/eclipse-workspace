import java.util.Comparator;

public class SortNachname implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getNachname().compareToIgnoreCase(o2.getNachname());
	}

}
