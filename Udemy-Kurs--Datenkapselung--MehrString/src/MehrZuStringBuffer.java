
public class MehrZuStringBuffer {

   //Neben String gibt es den Datentyp(Klasse) StringBuffer
   //Beim String wird immer ein neuer String erstellt,beim StringBuffer werden die Änderungen an demselben Object durchgeführt
	
	public static void main(String[] args) {
		
   //MERKE : String erzeugt oder verändert, es wird immer ein neuer String erstellt,weil String immutable(unveräderbar sind)
   //MERKE : StringBuffer erzeugt oder verändert, es ist immer das selbe Objekt	
		
		StringBuffer toStringBuffer = new StringBuffer("Hallo");
		System.out.println(toStringBuffer);
		
		toStringBuffer.append(", Wilkommen in meinem Kurs");
		System.out.println(toStringBuffer);
		
		toStringBuffer.setCharAt(10, 'l');
		System.out.println(toStringBuffer);
		
		System.out.println("-----");
		
		StringBuilder stringBuilder = new StringBuilder("Hi...");  //Wie StringBuffer nur erst ab der version 5
		StringBuilder stringBuilder2 = new StringBuilder(10);
		System.out.println(stringBuilder2);
		
		stringBuilder2.append("Hallo");
		System.out.println(stringBuilder2);
		stringBuilder2.insert(5, '!');
		System.out.println(stringBuilder2);

	}

}
