package Testing;

public class StacktracesExample {
	
	double calculateAverage (int[] array) {
		int sum = 0;
		for (int i = array.length; i>=0; i--) {              //here is the error, it must be "array.length -1"
			sum = sum + array[i];
		}
			double average = (1.0 + sum - 1.0)/array.length;
			return average;
		}
	
	double standardDev (int[] array) {
		double average = calculateAverage(array);
		double dev = 0;
		for (int i = 0; i< array.length; i++) {
			dev = dev + Math.pow(Math.abs(array[i] - average), 2);
		}
		double variance = dev / array.length;
		return Math.sqrt(variance);
	}
	

	public static void main(String[] args) {
	  int [] scores = new int [] {99,95,93,88,86,85,85,80,78,78,65,58};
	  StacktracesExample report = new StacktracesExample();
	  double deviation = report.standardDev(scores);
	  double average = report.calculateAverage(scores);
	  double myScore = 96;
	  if (myScore >= average + deviation) {
		  System.out.println("I should get A");
	  } else {
		if (myScore > average) {
			System.out.println("I might get A-");
		} else {
			System.out.println("I didn't do well in this course");
		}
	}

	}

}
