import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bulk Reservation");
		Scanner scan = new Scanner(System.in);
		System.out.println("Yes or No");
		String travelling = scan.next();
		while (travelling.equals("Yes")) {
			System.out.println("Number of people travelling ?");
			int num = scan.nextInt();
			for (int i = 1; i < num +1; i++) {
				System.out.println("Name:");
				String name = scan.next();
				System.out.println("Male of Female: ");
				String sex = scan.next();
				System.out.println("Age:");
				int age = scan.nextInt();
				
			}
		  System.out.println("Oops forgot someone ?");
		  travelling = scan.next();
			
		}
		
	}

}
