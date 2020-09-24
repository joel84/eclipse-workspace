
public class Main {

	public static void main(String[] args) {
		// DownloadManager dManager = new DownloadManager("Test");
		
		//https:\\www.audiobible.com\\content\\KingJames\\audio\\01_genesis\\01_genesis_001.mp3
		
		String downloadLink = "https://www.audiobible.com/content/KingJames/audio/01_genesis/01_genesis_001.mp3"; //for image , Bildadress kopieren und in Datei schreiben ändern .mp3
		
		new Thread(new DownloadManager(downloadLink)).start();

	}

}
