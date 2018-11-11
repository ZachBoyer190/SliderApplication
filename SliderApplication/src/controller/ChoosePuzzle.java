package controller;

import java.util.ArrayList;
import java.util.Random;

import entity.Piece;

public class ChoosePuzzle {
	
	Random rand = new Random();
	int randomValue, numPuzzle;
	
	public ChoosePuzzle(int numPuzzle) {
		randomValue = rand.nextInt(numPuzzle);
		
		if (randomValue == 0) {
			p1();
		} else if (randomValue == 1) {
			p2();
		} else if (randomValue == 2) {
			p3();
		} else if (randomValue == 3) {
			p4();
		}
		
	}
	
	private ArrayList<Piece> p1() {
		ArrayList<Piece> pieces = new ArrayList<>();
		
		Piece p1 = new Piece(0, 0, 1, 2, false, false);
		Piece p2 = new Piece(2, 0, 1, 2, false, false);
		Piece p3 = new Piece(2, 1, 1, 1, false, false);
		Piece p4 = new Piece(3, 1, 1, 1, false, false);
		Piece p5 = new Piece(2, 2, 1, 1, false, false);
		Piece p6 = new Piece(3, 2, 1, 1, false, false);
		Piece p7 = new Piece(0, 3, 1, 2, false, false);
		Piece p8 = new Piece(2, 3, 1, 2, false, false);
		Piece p9= new Piece(4, 1, 2, 1, false, false);
		Piece pGoal = new Piece(0, 1, 2, 2, true, false);
		
		pieces.add(p1);
		pieces.add(p2);
		pieces.add(p3);
		pieces.add(p4);
		pieces.add(p5);
		pieces.add(p6);
		pieces.add(p7);
		pieces.add(p8);
		pieces.add(p9);
		pieces.add(pGoal);
		
		return pieces;
	}
	
	private ArrayList<Piece> p2() {
		ArrayList<Piece> pieces = new ArrayList<>();

		Piece p1 = new Piece(0, 0, 1, 1, false, false);
		Piece p2 = new Piece(0, 3, 1, 1, false, false);
		Piece p3 = new Piece(1, 0, 1, 2, false, false);
		Piece p4 = new Piece(1, 3, 1, 2, false, false);
		Piece p5 = new Piece(2, 1, 1, 2, false, false);
		Piece p6 = new Piece(3, 0, 1, 1, false, false);
		Piece p7 = new Piece(3, 3, 1, 1, false, false);
		Piece p8 = new Piece(4, 0, 2, 1, false, false);
		Piece p9= new Piece(4, 2, 2, 1, false, false);
		Piece pGoal = new Piece(0, 1, 2, 2, true, false);
		
		pieces.add(p1);
		pieces.add(p2);
		pieces.add(p3);
		pieces.add(p4);
		pieces.add(p5);
		pieces.add(p6);
		pieces.add(p7);
		pieces.add(p8);
		pieces.add(p9);
		pieces.add(pGoal);
		
		return pieces;
	}
	
	private ArrayList<Piece> p3() {
		ArrayList<Piece> pieces = new ArrayList<>();
		
		Piece p1 = new Piece(0, 0, 1, 2, false, false);
		Piece p2 = new Piece(2, 0, 1, 2, false, false);
		Piece p3 = new Piece(0, 1, 1, 1, false, false);
		Piece p4 = new Piece(0, 2, 1, 1, false, false);
		Piece p5 = new Piece(0, 3, 1, 1, false, false);
		Piece p6 = new Piece(1, 1, 1, 2, false, false);
		Piece p7 = new Piece(3, 1, 2, 1, false, false);
		Piece p8 = new Piece(3, 3, 1, 1, false, false);
		Piece p9= new Piece(4, 2, 2, 1, false, false);
		Piece pGoal = new Piece(1, 2, 2, 2, true, false);
		
		pieces.add(p1);
		pieces.add(p2);
		pieces.add(p3);
		pieces.add(p4);
		pieces.add(p5);
		pieces.add(p6);
		pieces.add(p7);
		pieces.add(p8);
		pieces.add(p9);
		pieces.add(pGoal);
		
		return pieces;
	}
	
	private ArrayList<Piece> p4() {
		ArrayList<Piece> pieces = new ArrayList<>();
		
		Piece p1 = new Piece(0, 0, 1, 2, false, false);
		Piece p2 = new Piece(2, 0, 1, 2, false, false);
		Piece p3 = new Piece(4, 0, 1, 1, false, false);
		Piece p4 = new Piece(2, 1, 2, 1, false, false);
		Piece p5 = new Piece(3, 1, 1, 1, false, false);
		Piece p6 = new Piece(3, 2, 1, 1, false, false);
		Piece p7 = new Piece(0, 3, 1, 2, false, false);
		Piece p8 = new Piece(2, 3, 1, 2, false, false);
		Piece p9= new Piece(4, 3, 1, 1, false, false);
		Piece pGoal = new Piece(0, 1, 2, 2, true, false);
		
		pieces.add(p1);
		pieces.add(p2);
		pieces.add(p3);
		pieces.add(p4);
		pieces.add(p5);
		pieces.add(p6);
		pieces.add(p7);
		pieces.add(p8);
		pieces.add(p9);
		pieces.add(pGoal);
		
		return pieces;
	}
	
	

}
