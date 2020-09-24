import java.util.Scanner;

public class FactorialDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long sum = 0;
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
			}
			System.out.println("The factorial of " + userInput+ " is: " + factorial);
			
			System.out.println("-------");
			
			String digit = String.valueOf(factorial);       //to make the sum of the digits in the number
			for (int j = 0; j <= digit.length()-1 ; j++) {
				char c = digit.charAt(j);
				 sum = sum + Long.parseLong(String.valueOf(c));
			}
			System.out.println("The sum of the digits in the number factorial of " + userInput + " is: " + sum);
			
		}
	}

}
