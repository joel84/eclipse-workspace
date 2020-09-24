package Lesson1;

//Creation of Threads by Extending THREAD Class

class MyClass extends Thread {

	
	public void run() {
		//super.run();
		
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
		MyClass myClass = new MyClass();
		myClass.start();                            //start method is necessary for creating a thread
		
		MyClass myClass1 = new MyClass();
		myClass1.start();                           //creation of the second thread

	}

}
