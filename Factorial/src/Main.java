import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int userInput = scan.nextInt();
		long factorial = 1;
		
		if (userInput < 0) {
			System.out.println("must be positive");
		} else if (userInput == 0) {
			System.out.println("factorial = 1");
		} else {
			for (int i = 1; i < (userInput + 1); i++ ) {
				factorial = factorial * i;
				System.out.println(factorial);
			}
		}
		
	}

}
