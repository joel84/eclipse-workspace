import java.util.Scanner;

public class Verzweigungswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		System.out.println("15 oder 3 oder 16 oder 30");
		
		Scanner scan = new Scanner(System.in);
		int eingabUser = scan.nextInt();
		switch (eingabUser) { 
		case 3: {
			System.out.println("Das ist falsch !");
		} break;
		case 16: {
			System.out.println("Das ist richtig :) ");
		} break;
		case 30: {
			System.out.println("Das ist falsch !");
		} break;
		case 15: {
			System.out.println("Das ist falsch !");
		} break;
		default:  {
			System.out.println("Die Zahl ist unbekannt !");
		}
		}
	}

}
