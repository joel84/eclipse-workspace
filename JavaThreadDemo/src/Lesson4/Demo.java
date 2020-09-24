package Lesson4;

public class Demo {

	private static int count = 0;
	
	public static synchronized void inccount () {  // synchronized calls this lock in background so this count can be only accessed by one thread. It allows the variable to lock so that it can do its operation
		count++;
	}
	
	public static void main(String[] args) {
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for (int i=0; i<=10000; i++) {
				inccount();
			}		
		}
	});
	
    Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for (int i=0; i<=10000; i++) {
				inccount();
			}			
		}
	});
    
    t1.start();
    t2.start();
    
    try { //Java Thread join method can be used to pause the current thread execution until unless the specified thread is dead
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    System.out.println("Value : " + count);

	}

}
