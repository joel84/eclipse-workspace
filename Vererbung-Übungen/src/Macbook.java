import java.util.function.ToIntBiFunction;

public class Macbook extends Laptop {

	boolean touchbar;
	public Macbook(String marke, int ram, String cpu, double preis, boolean touchbar) {
		super(marke, ram, cpu, preis);
		this.touchbar = touchbar;
	}
	@Override
	public void starten() {
		
		super.starten();
		System.out.println("Macbook startet");
	}

	
}
