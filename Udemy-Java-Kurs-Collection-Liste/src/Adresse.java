
public class Adresse {

	private String name;
	private String stra�e;
	private String stadt;
	
	public Adresse(String name, String stra�e, String stadt) {
		super();
		this.setName(name);
		this.setStadt(stadt);
		this.setStra�e(stra�e);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getStra�e() {
		return stra�e;
	}

	public void setStra�e(String stra�e) {
		this.stra�e = stra�e;
	}
	
	
}
