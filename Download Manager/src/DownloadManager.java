import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadManager implements Runnable{

	
	private String link;
	private File outputFile;
	
	private String fileSeparator = System.getProperty("file.separator");
	private String downloadFolderPath = fileSeparator + "Users" + fileSeparator + "tuman" + fileSeparator + "Download";
	
	private File defaultDownloadFolder = new File(downloadFolderPath);
	
	public DownloadManager(String link) {
		this.link = link;
		
		if(!defaultDownloadFolder.exists()) {
			defaultDownloadFolder.mkdirs();
		}
	}

	@Override
	public void run() {
		try {
			URL url = new URL(link);
			HttpURLConnection hConnection = (HttpURLConnection)url.openConnection();
			
			//InputStream arbeitet immer mit Byte
			BufferedInputStream bufferedInputStream = new BufferedInputStream(hConnection.getInputStream());
			
			//Datei schreiben
			outputFile = new File(defaultDownloadFolder, "datei.mp3");     //.mp3 für audio , .jpg für image
			OutputStream outputStream = new FileOutputStream(outputFile); //In welcher Datei soll es gespeichert werden
			BufferedOutputStream bOutputStream = new BufferedOutputStream(outputStream, 1024); //1024 Bytes= 1K KBytes = Größer des Pufferspeichers
			
			byte[] buffer = new byte[1024];
			int downloaded = 0; //Wie viel Byte ist gesamt geladen worden?
			int readByte = 0;  //Wie viel Byte sinf aktuell geladen?
			
			while((readByte = bufferedInputStream.read(buffer,0 , 1024)) >= 0) {
				bOutputStream.write(buffer, 0, readByte);
				downloaded +=  readByte;
				
				System.out.println("Bereits " + downloaded + " Byte " + "geladen");
			}
			
			bOutputStream.close();
			bufferedInputStream.close();
			System.out.println("Download erfolgreich");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
