
public class Kuh extends Tier {
	
	int hufe;
	public Kuh(String name, int gewicht, int groe�e, int hufe){
		super(name,gewicht,groe�e);
		this.hufe = hufe;
	}
	@Override
	public void essen() {
		super.essen();
		System.out.println("Die Kuh muss das Essen immer wiederkauen!");
	}
	
}
