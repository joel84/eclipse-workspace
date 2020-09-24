package de.anonyme.Klasse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bisher
		Person p1 = new Person("Ralf");
		p1.printName();
		
		//anonym
		new Person("Olaf") {
			
			@Override
			public void printName() {
				System.out.println("Der Name: " + this.getName());
			}
		};
		
		Hund hund1 = new Hund();
		hund1.machLaute();
		
		Katze katze1 = new Katze();
		katze1.machLaute();
		
		Tier elefant = new Tier() {
			
			@Override
			public String machLaute() {
				
				return "törö";
			}
		};
	}

}
