import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to Iron Bank of Bravoos ATM");
		String restart = "Yes";
		int chances = 3;
		double balance = 67.14;
		String[] array = {"no", "No", "n","N"};
		int[] range = {10, 20, 40, 60, 80, 100};
		System.out.println("Please Enter your 4-Digit PIN:");
		while(chances >= 0) {
			Scanner scan = new Scanner(System.in);
			int pin = scan.nextInt();
			if(pin == 1234) {
				System.out.println("You entered your PIN correctly\n");
				boolean b1 = array.equals(restart);
				while(b1 = true) {
					System.out.println("Please Press 1 For Your Balance\n");
					System.out.println("Please Press 2 To Make a Withdrawal\n");
					System.out.println("Please Press 3 To Pay in\n");
					System.out.println("Please Press 4 To return Card\n");
					System.out.println("What Would You like to choose ?");
					int option = scan.nextInt();
					if(option == 1) {
						System.out.printf("Your Balance is Ä$: " + balance);
						System.out.println("\nWould You like to go back ?");
						restart = scan.next();
						if(array.equals(restart)) {
							System.out.println("Thank you");
						}
					} else if(option == 2) {
						System.out.println("How much would you like to withdraw?  \nÄ$10 /Ä$20 /Ä$40 /Ä$60 /Ä$80 /Ä$100");
						double withdrawal = scan.nextDouble();
						boolean b2 = range.equals(withdrawal);
						if(b2 == false) {
							 balance = balance - withdrawal;
							 System.out.printf("\nYour Balance is now Ä$: " + balance);
							 System.out.println("\nWould You like to go back ?");
							 restart = scan.next();
							 if(array.equals(restart)) {
									System.out.println("Thank you");
								}
						}else if(withdrawal == 1) {
							System.out.println("Please Enter desired Amount: ");
							withdrawal = scan.nextDouble();
						} else {
							System.out.println("Invalid Amount, Please Re-try\n");
							restart = "yes";
						}
					} else if(option == 3) {
						System.out.println("How much would you like to Pay in ?");
						double Pay_in = scan.nextDouble();
						balance = balance + Pay_in;
						System.out.printf("\nYour Balance is now Ä$: " + balance);
						System.out.println("\nWould You like to go back ?");
						restart = scan.next();
						if(array.equals(restart)) {
							System.out.println("Thank you");
						}
					} else if(option == 4) {
						System.out.println("Please wait while your Card is Returned ...\n");
						System.out.println("Thank you for your service !");
					} else {
						System.out.println("Please Enter a correct number.\n");
						restart = scan.next();
					}
				System.out.println("Have you done everything you wanted?");	
				restart = scan.next();
				b1 = array.equals(restart);
				
				}
			} else if(pin != 1234) {
				System.out.println("Incorrect password ");
				chances = chances - 1;
				if(chances == 0) {
					System.out.println("\nNo more Tries");
				}
			}
		}
		
		
		
	}

}
