package entity;

public class Piece {
	
	int row;
	int column;
	int sizeX;
	int sizeY;
	boolean goal;
	
	/*
	 * Constructor for the Piece Class
	 */
	
	public Piece(int row, int column, int sizeX, int sizeY, boolean goal) {
		
		this.row = row;
		this.column = column;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.goal = goal;
	}

	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public int getsizeX() {
		return sizeX;
	}
	
	public int getsizeY() {
		return sizeY;
	}
	
	public boolean isGoal() {
		return goal;
	}

	

}
