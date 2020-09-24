import java.util.Scanner;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long newuserInput=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer please");
		long userInput = scan.nextLong();
		
		for(long k=1; k<1000000; k++) {
			
			for(long j=userInput;j>=1;j+=userInput) {
			if(userInput == (2*k +1)) {
				 newuserInput = 3*j + 1;
			} else if(userInput  == 2*k) {
				 newuserInput = j/2;	
			}
			
		System.out.println("it is: " + newuserInput);
		
		}	
	}
  }
}
