package entity;

import java.util.ArrayList;

public class Puzzle {
	
	ArrayList<Piece> pieces = new ArrayList<>();
	
	public Puzzle(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}
	
	public ArrayList<Piece> getPieces(){
		return pieces;
	}

}
