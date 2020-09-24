
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hund bello = new Hund();
//		bello.name = "Bello";
//		
//		Kuh olga = new Kuh();
//		olga.name = "Olga";
		
		Hund belloHund = new Hund("Bello", 5, 3, 42);
		belloHund.essen();
		
		Kuh olga = new Kuh("Olga", 600, 150, 4);
		olga.essen();
	}
	
	BMW x1 = new BMW(130, 4 , "Kompakt-SUV", true);
	 
    Audi a3 = new Audi(180, 4,"Kompaktklasse",false);
    
    
}
