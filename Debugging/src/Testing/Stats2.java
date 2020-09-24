package Testing;

import java.util.ArrayList;
import java.util.Scanner;

public class Stats2 {

	ArrayList<Integer> numbers;
	
	public Stats2 () {
		numbers = new ArrayList<Integer>();
	}
	
	public double average(){                       
		int sum = 0;
		for (int i=0 ; i < numbers.size(); i++) {
			sum = sum + numbers.get(i);          // here was the problem sum = numbers.get(i)
		}
		return sum / (1.0 * numbers.size());     //let's make it a float; it was actually numbers.size() only
	}
	
	public double std (){
		double mean = average();
		double deviations = 0;
		//average sum of squared deviations.
		for (int i=0; i < numbers.size(); i++) {
			deviations += (numbers.get(i) - mean)*(numbers.get(i) - mean);;  //it was initially (numbers.get(i) - mean)^2 , but since ^ is not define...
		}
		double standardDev = Math.sqrt(deviations/ numbers.size() - (mean*mean));  // it was initially mean^2
		return standardDev;
	}
	
	public static void main(String[] args) {
		Stats2 stats = new Stats2();
		System.out.println("Enter some numbers, enter a 'q' to quit");
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (!input.equals("q")) {
			input = scan.next();
			if(!input.equals("q")) {
				stats.numbers.add(Integer.parseInt(input));
			}
		}
        System.out.println("The average is: " + stats.average());
        System.out.println("The standard deviation is: " + stats.std());
	}

}
