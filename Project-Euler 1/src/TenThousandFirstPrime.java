import java.util.ArrayList;

public class TenThousandFirstPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 1; i<= 40; i++) {
			
			int potentialFactor = 2;
			while(i % potentialFactor != 0) {
				potentialFactor++;
			}
			 if(potentialFactor == i) {
				 ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
				 primeNumbers.add(i);
				 System.out.println(primeNumbers.get(0));
				 
			 }
			
		}
	}

}
