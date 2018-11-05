package entity;

public class Piece {
	
	private int xCoord;
	int yCoord;
	int sizeX;
	int sizeY;
	boolean goal;
	
	/*
	 * Constructor for the Piece Class
	 */
	
	public Piece(int xCoord, int yCoord, int sizeX, int sizeY, boolean goal) {
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.goal = goal;
	}

	public int getxCoord() {
		return xCoord;
	}
	
	public int getyCoord() {
		return yCoord;
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
