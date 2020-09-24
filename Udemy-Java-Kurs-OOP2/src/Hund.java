
public class Hund extends Tier {
	
	int zaehne;
	
	public Hund (String name, int gewicht, int groeﬂe, int zaehne) {
		super(name, gewicht, groeﬂe);
		this.zaehne = zaehne;
	}
	
    public void bellen () {
    	
    }

	@Override
	public void essen() {
		System.out.println("Der Hund muss sein Essen noch kauen!");
		super.essen();
	}
    
}
