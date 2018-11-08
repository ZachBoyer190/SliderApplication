package entity;

public class Piece {
	
	int row;
	int column;
	int sizeX;
	int sizeY;
	boolean goal;
	boolean selected;
	
	/*
	 * Constructor for the Piece Class
	 */
	
	public Piece(int row, int column, int sizeX, int sizeY, boolean goal, boolean selected) {
		
		this.row = row;
		this.column = column;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.goal = goal;
		this.selected = selected;
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
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean b) {
		this.selected = b;
	}

	

}
