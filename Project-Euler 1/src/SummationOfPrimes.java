import java.util.Scanner;

public class SummationOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer please");
		long userInput = scan.nextLong();
		long sum = 0;
				

		for(int potentialFactor = 2; potentialFactor<= userInput; potentialFactor++) {
			long fin = userInput % potentialFactor;
			
			int ptf2 = 2;
			while (potentialFactor % ptf2 != 0) {     // to check if the number is actually prime
				ptf2++;
			}
			
			if (ptf2 == potentialFactor) {   
				sum = sum + potentialFactor;
				System.out.println(potentialFactor);
				System.out.println("it is: " + sum);
			} 
		}
		
		
	}

}
