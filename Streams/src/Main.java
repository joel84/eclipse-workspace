import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws IOException {

		/*Aus den Hauptklassen InputStream und OutputStream,Reader und Writer ergeben sich viele Subklassen. Jede 
		 * dieser Subklassen hat einen bestimmten Zweck.
		 * 
		 * Datei lesen : Ein InputStream wird genutzt um Daten aus einer Quelle (Datei, Netzwerk...) zu lesen.
		 * 
		 * In Datei schreiben: Ein OutputStream wird genutzt um Daten in eine Datei zu schreiben.
		 * 
		 * Am häufigsten nutzen wir FileInputStream und FileOutputStream als Subklassen.
		 * 
		 *Buffered Klassen: Diese Klassen arbeiten Effizienter, da alle anderen direkt lesen und schreiben. Anders ist 
		 *es bei Buﬀered Klassen, dort wird ein Puﬀerspeicher genutzt. Es gibt die Möglichkeit Buﬀered Klassen als
		 * Wrapper für nicht Buﬀered Klasse zu nutzen
		 * 
		 * ByteArrayOutput(Input)Stream = erlaubt das Schreiben oder Lesen von Daten in mehrere Dateien gleichzeitig
		 * 
		 * FilterOutput(Input)Stream = ObjectOutputStream = Primitive Daten und Objekte laden/schreiben
		 */

		InputStream inputStream = null;
		
		File file = new File("C:\\Users\\tuman\\Desktop\\JavaScript Aufgabe.txt");
		
		int i;
		char c;
		
		try {
			inputStream = new FileInputStream(file);
			
			while( (i = inputStream.read()) != -1 ) {
				c = (char) i;                  //Byte in Zeichen umwandeln
				System.out.print(c);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
		   // Merke Stream immer schließen
			inputStream.close();
		}
		
		
//		OutputStream outputStream = null;
//		
//		String name = "Markus Müller";
//			
//		try {
//			
//		outputStream = new FileOutputStream(file);
//		outputStream.write(name.getBytes());
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		} finally {
//			outputStream.close();
//		}
				
	}

}
