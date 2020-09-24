
public abstract class Samsung {

	private double preis;
	private String produktTyp;
	
	public Samsung () {
		
	}
	
	public Samsung(double preis, String produktTyp) {
		super();
		this.setPreis(preis);
		this.setProduktTyp(produktTyp);
	}
	
	
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getProduktTyp() {
		return produktTyp;
	}
	public void setProduktTyp(String produktTyp) {
		this.produktTyp = produktTyp;
	}
	
	
}
