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
	
	public boolean selectPiece(double xCoord, double yCoord, double height, double width) {
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
	
	public void movePiece(int[] direction) {
		for (Piece p: pieces) {
			if (p.isSelected()) {
				p.setRow(direction[0]);
				p.setColumn(direction[1]);
				p.setSelected(false);
				selected = false;
				break;
			}
		}
	}
	
	public void checkMove(int[] direction, double height, double width) {
		
		// Need to check all 4 points. So the upper left, upper right, lower left, lower right
		for (Piece outerPiece : pieces) {
			for (Piece p : pieces) {
				if (outerPiece.getsizeX() > 1 || outerPiece.getsizeY() > 1) {
				} else {
					
				}
			}
		}
	}

}
