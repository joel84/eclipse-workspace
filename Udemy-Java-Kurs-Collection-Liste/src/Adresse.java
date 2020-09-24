
public class Adresse {

	private String name;
	private String straﬂe;
	private String stadt;
	
	public Adresse(String name, String straﬂe, String stadt) {
		super();
		this.setName(name);
		this.setStadt(stadt);
		this.setStraﬂe(straﬂe);
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

	public String getStraﬂe() {
		return straﬂe;
	}

	public void setStraﬂe(String straﬂe) {
		this.straﬂe = straﬂe;
	}
	
	
}
