
//This contains a 20x20 array of Ships, representing the ”ocean,” and some methods to manipulate it.

public class Ocean {

	Ship[][] ships = new Ship[20][20];
	int shotsFired;
	int hitCount;
	int shipsSunk;
	
	public Ocean() {
		// TODO Auto-generated constructor stub
	}
	
	void placeAllShipsRandomly() {
		
	}
	
	boolean isOccupied(int row, int column) {
		return false;
	}
	
	boolean shootAt(int row, int column) {
		return false;
	}
	
	int getShotsFired() {
		return 0;
	}
	
	int getHitCount() {
		return 0;
	}
	
	int getShipsSunk() {
		return 0;
	}
	
	boolean isGameOver() {
		return false;
	}
	
	Ship[][] getShipArray() {
		return null;
	}
	
	void print() {
		
	}
	
}
