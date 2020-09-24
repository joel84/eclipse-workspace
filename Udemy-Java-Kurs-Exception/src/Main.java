import java.util.Scanner;

import beispielpaket.NichtDurchNullTeilenException;
import beispielpaket.Taschenrechner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taschenrechner.plus(5, 7);
		Scanner scan = new Scanner(System.in);
		try {
			
		    System.out.println("Bitte Zahl1 eingeben...");
			int userZahl1 = scan.nextInt();
			System.out.println("Bitte Zahl2 eingeben...");
			int userZahl2 = scan.nextInt();
			
			
		Taschenrechner.dividiere(userZahl1 ,userZahl2);	
			
		} catch (NichtDurchNullTeilenException e) {
		System.out.println("Man kann nicht durch 0 teilen");
		System.out.println("Bitte neue Zahlen eingeben...");
		int neueEingabe1 = scan.nextInt();
		int neueEingabe2 = scan.nextInt();
		
		e.getMessage();
		
		try {
			Taschenrechner.dividiere(neueEingabe1, neueEingabe2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
		System.out.println("Das Programm geht weiter!");
		
  }
}
