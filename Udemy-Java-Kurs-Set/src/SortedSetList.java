import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SortedSetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<String>();
		
		System.out.println("Liste unsortiert");
		list1.add("Peter");
		list1.add("Adrian");
		list1.add("Michi");
		list1.add("Peter");
		list1.add("Bernt");
		
		for (String string : list1) {
			System.out.println(string);
		}
		
		Collections.sort(list1);
			
		System.out.println("\nListe Sortiert");
		for (String string : list1) {
				System.out.println(string);
		}
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Peter");
		set1.add("Adrian");
		set1.add("Michi");
		set1.add("Peter");
		set1.add("Bernt");
		
		System.out.println("\nSet sortiert");
		for (String string : set1) {
			System.out.println(string);
		}

	}

}
