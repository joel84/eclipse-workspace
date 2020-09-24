
public class Hund extends Tier {
	
	int zaehne;
	
	public Hund (String name, int gewicht, int groeße, int zaehne) {
		super(name, gewicht, groeße);
		this.zaehne = zaehne;
	}
	
    public void bellen () {
    	
    }

	@Override
	public void essen() {
		System.out.println("Der Hund muss sein Essen noch kauen!");
	}
    
	public void atmen () {
		System.out.println("Der Hund atmet über die Lunge");
	}
}
