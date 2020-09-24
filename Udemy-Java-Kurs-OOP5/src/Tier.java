
public abstract class Tier {

	String name;
	int gewicht;
	int groeﬂe;
	
	public Tier () {
		
	}
	
	public Tier (String name, int gewicht, int groeﬂe) {
		this.name = name;
		this.gewicht = gewicht;
		this.groeﬂe = groeﬂe;
	}
	
	public abstract void essen ();
	
	public abstract void atmen ();
	
	public String getName () {
		return name;
	}
}
