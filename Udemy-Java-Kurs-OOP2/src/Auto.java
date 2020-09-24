
public class Auto {

	String marke;
	int ps;
	int tuerenAnzahl;
	String fahrzeugTypString;
	
	public Auto (String marke, int ps, int tuerenAnzahl, String fahrzeugTypString) {
		super();
		this.marke = marke;
		this.ps = ps;
		this.tuerenAnzahl = tuerenAnzahl;
		this.fahrzeugTypString = fahrzeugTypString;
	}
	
	public void starten () {
		System.out.println("Das Auto startet");
	}
	
}
