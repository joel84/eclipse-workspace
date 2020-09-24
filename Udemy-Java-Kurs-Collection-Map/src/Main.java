import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// K= Key= Schlüssel
		// V= Value = Inhalt
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(1234, "Tisch alsi");
		map1.put(3245, "Rad rewe");
		
		System.out.println("Werte: " + map1.get(1234));
		
		for (Integer key : map1.keySet()) {
			System.out.println("Artikelnummer:" + key);
			String value = map1.get(key);
			System.out.println("Wert: " + value);
		}
	}

}
