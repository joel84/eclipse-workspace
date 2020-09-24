
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		Computer cp1 = new Computer();
//		System.out.println(cp1.mainboard);
//		
//		Mainboard board1 = new Mainboard();
//		System.out.println(board1);
//		
//		cp1.mainboard = board1;
//		System.out.println(cp1.mainboard);
		
//		Mainboard board2= new Mainboard();
//		Computer cp2 = new Computer("Intel", board2, 500);
		
//		Mainboard mainboardAsus = new Mainboard(4, 2, 4);
//		Computer computerPeter = new Computer("Intel", mainboardAsus, 400);
//		System.out.println(computerPeter.mainboard.kartenSlots);
//		
//		Mainboard mainboardAsrock = new Mainboard(2, 1, 2);
//		Computer computerOlga = new Computer("AMD", mainboardAsrock, 350);
//		
//		Computer computerJoe = new Computer(8, 4, 8, "Intel");
		
		
		Auto bmw = new Auto("BMW", "Goodyear", "Winterreifen");
		bmw.ausgabeDaten();
		Auto vw = new Auto("VW", "michelin", "Sommerreifen");
		vw.ausgabeDaten();
	}

}
