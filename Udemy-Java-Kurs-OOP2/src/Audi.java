
public class Audi extends Auto {

	boolean quattro;
	public Audi( int ps, int tuerenAnzahl, String fahrzeugTypString, boolean quattro) {
		super("Audi", ps, tuerenAnzahl, fahrzeugTypString);
		
	}
	@Override
	public void starten() {
		
		super.starten();
		System.out.println("Ja und zwar ein Audi startet");
	}

	
	
}
