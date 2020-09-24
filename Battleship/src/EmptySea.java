
/*Describes a part of the ocean that does not have a ship in it. While it might seem silly to have
 *  the lack of a ship be a type of ship, this trick does simplify a number of things.
 */

public class EmptySea extends Ship {

	public EmptySea() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	String getShipType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	boolean shootAt(int row, int column) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean isSunk() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
