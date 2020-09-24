
public class Laptop {
	int ram;
	int preis;
	String marke;
	
	public Laptop () {
		
	}
	 
	public Laptop (int ram, int preis, String marke) {
		this.ram = ram;
		this.preis = preis;
		this.marke = marke;
	}
	
	public void eigenschaften (int ram, int preis, String marke) {
		System.out.println("Dieser Laptop hat die folgenden Eigenschaften: " + " RAM: " + this.ram + " ; Preis: " + this.preis + " ; Marke: " + this.marke);
	}

}
