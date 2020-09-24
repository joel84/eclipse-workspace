package de.lokale.klasse;

public class Mannschaft {

	
	//Methode der Klasse Mannschaft
	public void erstelleSportler () {
		
		class Sportler {
			String name;
			int alter;
			
			public Sportler (String name, int alter) {
				this.name = name;
				this.alter = alter;
			}
			
			public void getSportler () {
				System.out.println("Sportler erstellt: " + this.name + " ; Alter: " + this.alter);
			}
		
		}
		 
		Sportler sp1 = new Sportler("Peter", 23);
		Sportler sp2 = new Sportler("Mike", 26);
		Sportler sp3 = new Sportler("Hans", 34);
		
		sp1.getSportler();
		sp2.getSportler();
		sp3.getSportler();
		
	}  //Ende der Methode
	
}
