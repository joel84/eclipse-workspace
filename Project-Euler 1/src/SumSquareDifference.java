
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int sum2 = 1;
		int sum3;
		int x2 = 1;
		
		for(int i = 1; i<=100; i++) {      //the sum of the squares of the first one hundred natural numbers
			int x1 = (i*i);
			sum = sum + x1;
		}
		System.out.println(sum);
		
		while(x2<100) {                   //the square of the sum of the first one hundred natural numbers
			int i = x2 + 1;
			sum2 = sum2 + i;
			x2++;
		}
		sum3 = (sum2*sum2) - sum;
		
		System.out.println("the difference is : " + sum3);
		
	}

}
