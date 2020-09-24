import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int n = 20;
		Random rand = new Random();
		int myrand = rand.nextInt(20) + 1;
		int guess = 0;
				
		while (guess != myrand ) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number between 1 and 20:");
			int userInput = scan.nextInt();
			guess = userInput;
			if (guess > 0) {
				if (guess > myrand) {
					System.out.println("Number too large");
				}else if (guess < myrand) {
					System.out.println("Number too small");
				} else {
					System.out.println("Congratulations, you made it !");
				}
			} 
		}
	}
}


