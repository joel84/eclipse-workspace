import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Maximal number ?");
		int max = scan.nextInt();
		for(int a = 1; a < max + 1; a++) {
			for(int b = a; b < max; b++) {
				int c_square = (a*a) + (b*b);
				int c = (int) Math.sqrt(c_square);
				if((c_square - (c*c))== 0 ) {
					System.out.println("a = " + a + "; b = " + b + "; c = " + c);
					
				}
			}
		}
		
	}

}
