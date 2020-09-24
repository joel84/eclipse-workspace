package DSÜbung;

import java.util.*;

public class Smartphone {

	private static List<Kontakt> meineKontakt;
	
	public Smartphone () {
		meineKontakt = new ArrayList<Kontakt>();
	}
	
	public boolean addKontakt (Kontakt neuerKontakt) {
		
		for (Kontakt kontaktInListe : meineKontakt) {
			if (neuerKontakt.getName().equals(kontaktInListe.getName())) {
				System.out.println("Kontakt bereits vorhanden");
				return false;
			} 
		}
		meineKontakt.add(neuerKontakt);
		System.out.println("Kontakt wurde hinzugefügt");
		 return true;
	}
	
	public boolean findKontakt (String name) {
		
		for (Kontakt kontaktInListe : meineKontakt) {
			if (name.equals(kontaktInListe.getName())) {
				System.out.println("Gefunden..." + " Name: " + kontaktInListe.getName() + " Tel: " + kontaktInListe.getTelefonNummer());
				return true;
			} 
		}
		System.out.println("Kontakt wurde nicht gefunden");
		return false;
	}
    public void ausgabe () {
    	for (Kontakt kontaktInListe : meineKontakt) {
			System.out.println("Name: " + kontaktInListe.getName() + " Tel: "+ kontaktInListe.getTelefonNummer());
		}
    }
}