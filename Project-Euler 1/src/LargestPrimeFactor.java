import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer please");
		long userInput = scan.nextLong();
				

		for(int potentialFactor = 2; potentialFactor<= userInput; potentialFactor++) {
			long fin = userInput % potentialFactor;
			
			int ptf2 = 2;
			while (potentialFactor % ptf2 != 0) {     // to check if the number is actually prime
				ptf2++;
			}
			
			if (fin == 0 && ptf2 == potentialFactor) {      //fin==0 means that potentialfactor can divide userInput
				System.out.println(potentialFactor);
			} 
		}
		
		
	}

}
