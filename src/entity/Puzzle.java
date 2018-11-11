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
	
	public void setPuzzle(ArrayList<Piece> p) {
		this.pieces = p;
	}
	
	public void deselect() {
		Piece p = findSelected();
		p.setSelected(false);
		selected = false;
	}
	
	public boolean selectPiece(double xCoord, double yCoord, double height, double width) {
		selected = false;
		for (Piece p : pieces) {
			if (xCoord >= p.getColumn()*width && xCoord <= (p.getColumn()*width) + (p.getsizeX()*width) && yCoord >= p.getRow()*height && yCoord <= (p.getRow()*height + (p.getsizeY()*height))) {
				p.setSelected(true);
				selected = true;
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
		boolean valid = true;
		// find upperLeft and lowerRight points of the selected piece when in the moved position
		// Keys are Y Coordinates, Values are X Coordinates
		Pair<Integer, Integer> upperLeftSelected = new Pair<>((findSelected().getRow() + direction[0])*height, (findSelected().getColumn() + direction[1])*width);
		Pair<Integer, Integer> lowerRightSelected = new Pair<>(((findSelected().getRow() + direction[0])*height) + (findSelected().getsizeY()*height), ((findSelected().getColumn() + direction[1])*width) + (findSelected().getsizeX()*width));
		Pair<Integer, Integer> upperLeftBorder = new Pair<>(0, 0);
		Pair<Integer, Integer> lowerRightBorder = new Pair<>(height * 5, width * 4);

		// Check collision with border
		if(upperLeftSelected.getValue() < upperLeftBorder.getValue()) {
			valid = false;
			
			} else if (upperLeftSelected.getKey() < upperLeftBorder.getKey()) {
				valid = false;
				
			} else if (upperLeftSelected.getValue() > lowerRightBorder.getValue()) {
				valid = false;
					
			} else if(upperLeftSelected.getKey() > lowerRightBorder.getKey()) {
				valid = false;
				
			} else if(lowerRightSelected.getValue() < upperLeftBorder.getValue()) {
				valid = false;
				
			} else if (lowerRightSelected.getKey() < upperLeftBorder.getKey()) {
				valid = false;
					
			} else if (lowerRightSelected.getValue() > lowerRightBorder.getValue()) {
				valid = false;
						
			} else if(lowerRightSelected.getKey() > lowerRightBorder.getKey()) {
				valid = false;
			}
		
		// Check collisions with other pieces
		if(valid) { 
			for (Piece p : pieces) {
				if (!p.isSelected()) {
					Pair<Integer, Integer> upperLeft = new Pair<>(p.getRow()*height, p.getColumn()*width);
					Pair<Integer, Integer> lowerRight = new Pair<>((p.getRow()*height) + (p.getsizeY()*height), (p.getColumn()*width) + (p.getsizeX() * width));
					
					if(upperLeftSelected.getValue() >= lowerRight.getValue() || upperLeft.getValue() >= lowerRightSelected.getValue() || upperLeftSelected.getKey() >= lowerRight.getKey() || upperLeft.getKey() >= lowerRightSelected.getKey()) {
						valid = true;
					} else {
						valid = false;
					}
					
					if(!valid) {
						break;
					}
					
				}
			}
		}	
		
		return valid;
	}
	
	public boolean checkWin(int[] direction, int height, int width) {
		// Find points on the selected piece and on the gate
		
		Pair<Integer, Integer> upperLeftSelected = new Pair<>((findSelected().getRow() + (findSelected().getsizeY()*direction[0]))*height, (findSelected().getColumn() + direction[1])*width);
		Pair<Integer, Integer> leftWin = new Pair<>(5*height, width);
		
		boolean win = false;
		if(findSelected().isGoal()) {
			if(upperLeftSelected.getValue().equals(leftWin.getValue() ) && upperLeftSelected.getKey().equals(leftWin.getKey())) {
				win = true;
			}
		}
		return win;
	}
	
	public Puzzle deepCopy(Puzzle puzzle) {
		ArrayList<Piece> copied = new ArrayList<>();
		for (Piece p : puzzle.pieces) {
			Piece pNew = new Piece(p.getRow(), p.getColumn(), p.getsizeX(), p.getsizeY(), p.isGoal(), p.isSelected());
			copied.add(pNew);
		}
		Puzzle copiedPuzzle = new Puzzle(copied);
		return copiedPuzzle;
	}

}
