
// to calculate the exponent of a number: "double result = Math.pow(number, exponent);"

public class PowerDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long sum = 0;
		long result;
		result = (long) Math.pow(2, 15);
		System.out.println(result);
		
		String digit = String.valueOf(result);
		for (int j = 0; j <= digit.length()-1 ; j++) {
			char c = digit.charAt(j);
			 sum = sum + Long.parseLong(String.valueOf(c));
		}
		System.out.println("The sum of the digits of that number is: " + sum);
		
	}

}
