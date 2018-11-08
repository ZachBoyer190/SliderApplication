package entity;

import java.util.ArrayList;

public class Puzzle {
	
	ArrayList<Piece> pieces = new ArrayList<>();
	
	boolean selected = false;
	
	public Puzzle(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}
	
	public ArrayList<Piece> getPieces(){
		return pieces;
	}
	
	public boolean hasSelected() {
		return selected;
	}
	
	public boolean selectPiece(int xCoord, int yCoord, double height, double width) {
		selected = false;
		for (Piece p : pieces) {
			if (xCoord >= p.getColumn()*width && xCoord <= (p.getColumn()*width + width)) {
				if(yCoord >= p.getRow()*height && yCoord <= (p.getRow()*height + height)) {
					p.setSelected(true);
					
					selected = true;
				}
				
			} 
				
			
		}
		
		return selected;
	}

}
