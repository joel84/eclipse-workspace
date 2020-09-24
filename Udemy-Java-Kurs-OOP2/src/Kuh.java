
public class Kuh extends Tier {
	
	int hufe;
	public Kuh(String name, int gewicht, int groeﬂe, int hufe){
		super(name,gewicht,groeﬂe);
		this.hufe = hufe;
	}
	@Override
	public void essen() {
		super.essen();
		System.out.println("Die Kuh muss das Essen immer wiederkauen!");
	}
	
}
