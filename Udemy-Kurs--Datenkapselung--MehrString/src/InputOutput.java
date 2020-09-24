import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("Bitte eine Zahl eintippen...");
double zahl = scan.nextDouble();
System.out.println("Ihre Zahl lautet : " + zahl);
Scanner scan2 = new Scanner(System.in);
System.out.println("Bitte geben Sie Ihre Name");
String zeichenkette = scan2.next();
System.out.println("Bitte geben Sie Ihrer Alter");
int alter = scan2.nextInt();
System.out.println("Ihre Name ist : " + zeichenkette + ", " + "Ihr Alter : " + alter);
	}

}
