
public class Auto {
	
	int reifen;
	int preis;
	
	String marke;
	
	public Auto () {

}
	
	public Auto (int reifen, int preis, String marke) {
		this.reifen = reifen;
		this.preis = preis;
		this.marke = marke;
	}
	
	public void gasgeben ( ) {
		System.out.println("Das Auto mit der Marke " + this.marke + " fährt jetzt los.");
	}
	 
	public void bremsen () {
		System.out.println("Das Auto mit der Marke " + this.marke + " bremst!");
	}
	
	public void vergleichePreis (int preis) {
		if (this.preis <= preis) {
			System.out.println("Der " + this.marke + " ist billiger.");
		} else {
			System.out.println("Der " + this.marke + " ist teurer.");
		}
	}
}	
