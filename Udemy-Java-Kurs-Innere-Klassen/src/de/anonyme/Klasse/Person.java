package de.anonyme.Klasse;

public class Person {

	//Eigenschaften
	private String name;
	
	//Konstruktor
	public Person (String _name) {
		this.name = _name;
	}
	
	//Methoden
	public void printName () {
		System.out.println(this.name);
	}
	
	public String getName () {
		return name;
	}
}
