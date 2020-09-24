
// This describes characteristics common to all the ships.

public abstract class Ship {

	private int bowRow;
	private int bowColumn;
	private int length;
	private boolean horizontal;
	private boolean[] hit;
	
	public int getBowRow() {
		return bowRow;
	}
	public void setBowRow(int bowRow) {
		this.bowRow = bowRow;
	}
	
	public int getBowColumn() {
		return bowColumn;
	}
	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public boolean isHorizontal() {
		return horizontal;
	}
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}
	
	public boolean[] getHit() {
		return hit;
	}
	public void setHit(boolean[] hit) {
		this.hit = hit;
	}
	
	abstract String getShipType();
	
	abstract boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean);
	
    abstract void placeShipAt(int row, int column, boolean horizontal, Ocean ocean);
     
    abstract boolean shootAt(int row, int column); 
     
    abstract boolean isSunk();
	
    @Override
    public abstract String toString();
    
}
