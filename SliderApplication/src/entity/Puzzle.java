package entity;

import java.util.ArrayList;

import boundary.PuzzleView;
import javafx.util.Pair;

public class Puzzle {
	
	PuzzleView puzzle;
	ArrayList<Piece> pieces = new ArrayList<>();
	
	boolean selected = false;
	boolean win = false;
	
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
	
	public void movePiece(int[] direction, int height, int width) {
		for (Piece p: pieces) {
			if (p.isSelected() && checkMove(direction, height, width)) {
				p.setRow(direction[0]);
				p.setColumn(direction[1]);
				break;
			}
		}
		findSelected().setSelected(false);
		selected = false;
	}
	
	public Piece findSelected() {
		Piece selectedP = null;
		if (hasSelected()) {
			for (Piece p : pieces) {
				if(p.isSelected()) {
					selectedP = p;
					break;
				}
			}
		}
		return selectedP;
	}
	
	// make sure height and width are the piece height and width
	public boolean checkMove(int[] direction, int height, int width) {
		boolean valid = false;
		// find upperLeft and lowerRight points of the selected piece when in the moved position
		// Keys are Y Coordinates, Values are X Coordinates
		Pair<Integer, Integer> upperLeftSelected = new Pair<>((findSelected().getRow() + direction[0])*height, (findSelected().getColumn() + direction[1])*width);
		Pair<Integer, Integer> lowerLeftSelected = new Pair<>(((findSelected().getRow() + direction[0])*height) + (findSelected().getsizeY()*height), ((findSelected().getColumn() + direction[1])*width) + (findSelected().getsizeX()*width));
		
		for (Piece p : pieces) {
			if (!p.isSelected()) {
				Pair<Integer, Integer> upperLeft = new Pair<>(p.getRow()*height, p.getColumn()*width);
				Pair<Integer, Integer> lowerRight = new Pair<>((p.getRow()*height) + (p.getsizeY()*height), (p.getColumn()*width) + (p.getsizeX() * width));
				
				if(upperLeftSelected.getValue() >= lowerRight.getValue() || upperLeft.getValue() >= lowerLeftSelected.getValue() || upperLeftSelected.getKey() >= lowerRight.getKey() || upperLeft.getKey() >= lowerLeftSelected.getKey()) {
					valid = true;
				} else {
					valid = false;
				}
				
				if(!valid) {
					break;
				}
				
			}
		}
		
		return valid;
	}

}
