
public class Tier {

	String name;
	int gewicht;
	int groeﬂe;
	
	public Tier (String name, int gewicht, int groeﬂe) {
		this.name = name;
		this.gewicht = gewicht;
		this.groeﬂe = groeﬂe;
	}
	
	public void essen () {
		System.out.println("Das Tier hat gegessen !");
	}


}
