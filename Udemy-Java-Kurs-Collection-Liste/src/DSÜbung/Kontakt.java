package DSÜbung;


public class Kontakt {
	
	private String name;
	private String telefonNummer;
	
	public Kontakt(String name, String telefonNummer) {
		this.name = name;
		this.telefonNummer = telefonNummer;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelefonNummer() {
		return telefonNummer;
	}
	public void setTelefonNummer(String telefonNummer) {
		this.telefonNummer = telefonNummer;
	}
	
	public static Kontakt erstelleKontakt (String name, String telefonNummer) {
		 
		return new Kontakt(name, telefonNummer);
	}
}
