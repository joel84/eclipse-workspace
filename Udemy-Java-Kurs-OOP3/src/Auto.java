
public class Auto {

	String autoMarke;
	Reifen reifen;
	
	public Auto () {
		
	}
	
	public Auto (String autoMarke,String reifenMarke ,String reifenTyp) {
	  reifen = new Reifen(reifenMarke, reifenTyp);
	this.autoMarke = autoMarke;
	}
	
	public void ausgabeDaten () {
		System.out.println("Die Automarke heiﬂt: " + this.autoMarke + " und der Reifentyp ist: " + this.reifen.reifenTyp);
	}
	
}
