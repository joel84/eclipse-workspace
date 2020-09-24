import org.omg.CORBA.PRIVATE_MEMBER;

public class Held {

	public String name;
	private int lebensPunkte;
	private int schaden =10;
	
	public Held (int lebensPunkte) {
		if (lebensPunkte<= 100 && lebensPunkte>0 ) {
		this.lebensPunkte = lebensPunkte;
		}
		
	}
	
	public void getLebenspunkte () {
		
		System.out.println(this.lebensPunkte);
	}
	
	public void setLebenspunkte () {
	
		this.lebensPunkte = this.lebensPunkte - schaden;
		System.out.println(this.lebensPunkte);
	}
}
