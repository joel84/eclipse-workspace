import java.util.Scanner;

public class Schl�sselwortif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Wie viele Bundesl�nder hat Deutschland?");
System.out.println("15 oder 3 oder 16 oder 30");

Scanner scan = new Scanner(System.in);
int eingabUser = scan.nextInt();
if (eingabUser == 15) {
	System.out.println("Das ist faslch !");
} else if (eingabUser ==3) {
	System.out.println("Das ist faslch !");
}else if (eingabUser == 16) {
		System.out.println("Das ist richtig !");
	} else if (eingabUser == 30) {
		System.out.println("Das ist faslch !");
	}
	}
}
