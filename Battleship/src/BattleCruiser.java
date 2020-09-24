
//Describes a battlecruiser - a ship that occupies 7 squares.

public class BattleCruiser extends Ship {

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

}
