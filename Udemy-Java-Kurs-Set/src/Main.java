import java.util.*;


class Person {
	private int id;
	private String name;
	
	public Person (int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString () {
		return "ID: " + this.id + " Name: " + this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DatenStruktur erzeugen
//		List<String> list1 = new ArrayList<String>();
//		
//		Set<String> set1 = new TreeSet<String>();
		Set<Person> set2 = new HashSet<Person>();
//		Set<String> set3 = new LinkedHashSet<String>();
//		
//		//Dateneingabe
//		list1.add("Peter");
//		list1.add("Adrian");
//		list1.add("Michi");
//		list1.add("Peter");
//		list1.add("Bernt");
//		
//		//Treeset
//		set1.add("Peter");
//		set1.add("Adrian");
//		set1.add("Michi");
//		set1.add("Peter");
//		set1.add("Bernt");
		
		Person p1 = new Person(1, "Chris");
		Person p2 = new Person(2, "Peter");
		Person p3 = new Person(3, "Hans");
		Person p4 = new Person(4, "Petra");
		Person p5 = new Person(1, "Chris");
		
		//Hashset
		set2.add(p1);
		set2.add(p2);
		set2.add(p3);
		set2.add(p4);
     	set2.add(p5);
		
		for (Person person : set2) {
			System.out.println(person);
		}
		
		
//		
//		//LinkedHashset
//		set3.add("Peter");
//		set3.add("Adrian");
//		set3.add("Michi");
//	    set3.add("Peter");
//		set3.add("Bernt");
//		
//		System.out.println("Ausgabe ArrayList: ");
//		Main.getElement(list1);
//		System.out.println("\nAusgabe Treeset: ");
//		Main.getElement(set1);
//		System.out.println("\nAusgabe Hashset: ");
//		Main.getElement(set2);
//		System.out.println("\nAusgabe LinkedHashset: ");
//		Main.getElement(set3);
//	}
//		
//         public static void getElement(Collection<String> collection) {
//        	 for (String string : collection) {
//				System.out.println(string);
//			}
	}
}