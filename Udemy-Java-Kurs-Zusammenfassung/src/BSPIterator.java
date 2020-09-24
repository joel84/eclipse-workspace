import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.omg.CORBA.IRObject;

public class BSPIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList<String>();
		
		list.add("Michael");
		list.add("Chris");
		list.add("Peter");
		list.add("Petra");
		list.add("Andi");
		list.add("Hans");
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			
			if (value.equals("Andi")) {
				it.remove();
			}
		}
		
		System.out.println();
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
