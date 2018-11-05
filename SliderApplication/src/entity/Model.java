package entity;

import java.util.ArrayList;

/*
 * Controller Class for the high level model
 */

public class Model {
	ArrayList<Piece> listOfPiece = new ArrayList<>();
	Piece active = null;
	
	public void setActivePiece(Piece p) {
		active = p;
	}
	
	public Piece getActive() {
		return active;
	}
		
	public void addPiece(Piece p){
		listOfPiece.add(p);
	}
	
	public ArrayList<Piece> getPieces(){
		return listOfPiece;
	}
	
}
