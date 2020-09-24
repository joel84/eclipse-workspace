//Find the sum of all the multiples of 3 or 5 below 1000.

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 
		
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		while(i<=333) {       // la somme des multiples de 3 inferieur a 1000
			int x1 = 3*i;
			sum = sum + x1;
			i++;
		}
		System.out.println("the sum of multiple of 3 is :" + sum);
		
		while(j<=199) {          // la somme des multiples de 5 inferieur a 1000
			int x2 = 5*j;
			sum2 = sum2 + x2;
			j++;
		}
		System.out.println("the sum of multiple of 5 is :" + sum2);
		
		while(k<=66) {            // la somme des multiples communs a 3 et 5
			int x3 = 15*k;
			sum3 = sum3 + x3;
			k++;
		}
		System.out.println("the sum of multiple of 15 is :" + sum3);
      
		System.out.println("The final sum is: " + (sum+sum2-sum3));  // la somme des multiples de 3 et 5 en dessous de 1000
  }
}
