import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a positive integer please");
	int userInput = scan.nextInt();
	
	int potentialFactor = 2;
	while (userInput % potentialFactor != 0 ) {
		potentialFactor++;
	}
	
	if(potentialFactor == userInput) {
		System.out.println("This number is prime");
			}
	else {
		System.out.println("This number is not prime, factor is :" + potentialFactor);
	}

	}

}
