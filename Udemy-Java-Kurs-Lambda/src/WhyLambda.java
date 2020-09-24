import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class WhyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer [] numbers = {5,11,17,3,1,100,300,120};
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//			
			//Anonyme Klasse
//			Arrays.parallelSort(numbers, new Comparator<Integer>() {
//
//				@Override
//				public int compare(Integer o1, Integer o2) {
//					
//					return 0;
//				}
//			});

			//Lambda 
		   //(Parameter) -> {    }
//			Arrays.parallelSort(numbers, (a,b) -> b-a);
//			
//			for (int i = 0; i < numbers.length; i++) {
//				System.out.println(numbers[i]);
//			}
//		}
		
		
		//foreachSchleife
		ArrayList<String> itemStrings = new ArrayList<String>();
		itemStrings.add("Einkaufen");
		itemStrings.add("Sport");
		itemStrings.add("Uni lernen");
		itemStrings.add("Freunde treffen");
        itemStrings.add("Freunde anrufen");

        itemStrings.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println( t);
			}
		});
        
        //Parameter ( ) -> {   }
        itemStrings.forEach((String t) -> {
        	System.out.println(t);
       
        });
        
        itemStrings.forEach((t) -> {
        System.out.println(t);
       
        });
        
        itemStrings.forEach(t -> {
        	System.out.println(t);
        });
        
        itemStrings.forEach(t -> System.out.println(t +" Test"));
        
        
        LinkedList<Person> personsList = Person.createShortList();
        
        for (Person person : personsList) {
			person.getPersonData();
		}
        
        //personsList sortieren
        
        //Mit einer Anonymen Klasse
        Collections.sort(personsList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getVorname().compareToIgnoreCase(o2.getVorname());
			}
		});
        
        for (Person person : personsList) {
			person.getPersonData();
		}
	}

}
