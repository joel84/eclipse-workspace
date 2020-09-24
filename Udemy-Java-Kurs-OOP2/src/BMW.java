
public class BMW extends Auto {

	boolean xDrive;
	public BMW(int ps, int tuerenAnzahl, String fahrzeugTypString, boolean xDrive) {
		super("BMW", ps, tuerenAnzahl, fahrzeugTypString);
		this.xDrive = xDrive;
	}
	
	@Override
	public void starten() {
		
		super.starten();
		System.out.println("Nämlich der BMW startet");
	}
	

}
