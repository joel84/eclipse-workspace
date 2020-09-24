
public class Computer {

	String cpu;
	Mainboard mainboard;
	int preis;
	
	public Computer(String cpu, Mainboard mainboard, int preis) {
		super();
		this.cpu = cpu;
		this.mainboard = mainboard;
		this.preis = preis;
	}
	
	public Computer (int ramSlots,int kartenSlots,int usbports, String cpu) {
		mainboard = new Mainboard(ramSlots, kartenSlots, usbports);
		this.cpu = cpu;
	}
}
