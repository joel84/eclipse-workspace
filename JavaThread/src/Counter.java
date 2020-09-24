
public class Counter implements Runnable {

	//Eigenschaften
	private long count = 0;
	
	public Counter (long count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		
		Thread thread = Thread.currentThread();
		for (long count = 0; count <= 100 ; count++) {
			System.out.println(thread + "Count: " + count);
		}
		
	}

}
