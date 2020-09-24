
public class JavaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Thread thread = new Thread(new SecondThread());
//		thread.start();
//		
//		//Anonyme Klasse
//		Thread thread2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				
//			}
//		});
//		
//		//Lambda
//		Thread thread3 = new Thread(()  ->  {
//			//Aufgabe der Abteilung 3
//	});
//        thread3.start();
		
		Thread thread = new Thread(new Counter(20), "First");
		thread.start();
		Thread thread2 = new Thread(new Counter(80), "Second");
		thread2.start();
  }
}
