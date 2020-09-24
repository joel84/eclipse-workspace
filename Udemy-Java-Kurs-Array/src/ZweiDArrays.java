
public class ZweiDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array2D = new int[3][3];
		array2D[0][0]= 30;
		array2D[0][1]= 40;
		array2D[0][2]= 38;
		array2D[2][1]= 543;
		array2D[1][1]= 1;
		
		for(int zeile = 0; zeile < array2D.length; zeile++) {
			for(int spalte = 0; spalte < array2D[zeile].length; spalte++) {
				System.out.println(array2D[zeile][spalte] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		
		int[][] nextarray2D = {
				{22,40,50},
				{33,56,80},
				{11,3,6},
				{222,444,50}
				
		};
		
		for(int zeile = 0; zeile < nextarray2D.length; zeile++) {
			for(int spalte = 0; spalte < nextarray2D[zeile].length; spalte++) {
				System.out.println(nextarray2D[zeile][spalte] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Zeilen der Tabelle: " + nextarray2D.length);
		
	}

}
