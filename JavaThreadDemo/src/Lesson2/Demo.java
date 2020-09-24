package Lesson2;

//Creation of Threads by implementing Runnable Interface

class MyClass implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getId() + "Value : " + i);               //to know which thread is running or printing which value
		}
		try {
			Thread.sleep(100);                                      //to run in concurrency , it will pause the method for 100 millis
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class Demo {

	public static void main(String[] args) {
	Thread t1 = new Thread(new MyClass());
	Thread t2 = new Thread(new MyClass());
	t1.start();
	t2.start();
	
	}

}
