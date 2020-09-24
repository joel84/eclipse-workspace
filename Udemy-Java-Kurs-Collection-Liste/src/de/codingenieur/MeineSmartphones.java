package de.codingenieur;

import DSÜbung.*;

public class MeineSmartphones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone iphone6 = new Smartphone();
		iphone6.addKontakt(Kontakt.erstelleKontakt("Christian", "48764956"));
		iphone6.addKontakt(Kontakt.erstelleKontakt("Peter", "598484956"));
		iphone6.addKontakt(Kontakt.erstelleKontakt("Hans", "532252956"));
		iphone6.addKontakt(Kontakt.erstelleKontakt("Petra", "7123255"));
		
		Kontakt petra = new Kontakt("Petra", "7123255");
		iphone6.addKontakt(petra);
		
		iphone6.ausgabe();
		
		System.out.println("Suchen");
		iphone6.findKontakt("Petra");
	}

}
