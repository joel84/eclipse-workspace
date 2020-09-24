
public class MethodeReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int summe = taschenrechner(5, 8 ,'+');
		System.out.println(summe);
	}
	
	public static int taschenrechner (int zahl1, int zahl2, char operator) {
		int summe;
		if (operator == '+') {
			summe = zahl1 + zahl2;
		} else {
			summe = zahl1 - zahl2;
		}
		return summe;
	}

}
