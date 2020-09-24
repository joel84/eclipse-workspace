
public class Methode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 1; i <= 10; i++) {
//			erstelleGegner();
//		}
		
        erstelleGegner("Peter", 100);
        erstelleGegner("Paul", 100);
        
	}
	
//	public static void erstelleGegner () {
//		String gegnerName = "Olaf";
//		int gegnerLeben = 100;
//		System.out.println("Gegner wurde erstellt");
//	}

	public static void erstelleGegner (String name, int lebenspunkte) {
		String gegnerName = name;
		int gegnerLeben = lebenspunkte;
		System.out.println("Gegner wurde erstellt: " + gegnerName + ", LP: " + gegnerLeben);
	}
}
