package controller;

import java.util.ArrayList;

import entity.Piece;
import entity.Puzzle;
import boundary.SliderApplication; 
import entity.Model;

import junit.framework.TestCase;

public class TestMove extends TestCase{
	
	SliderApplication app;
	Model m;
	Puzzle puzzle;
	Piece p1, p2;

	@Override
	protected void setUp() {
		p1 = new Piece(0, 1, 2, 1, false, false);
		p2 = new Piece(4, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		m = new Model();
		app = new SliderApplication(puzzle, m);
		app.setVisible(true);
	}
	
	public void testMovePieceNotWin() {
		int [] direction = {1, 0};
		puzzle.selectPiece(1.5, 0.5, 1, 1);
		Move move = new Move(app, puzzle);
		move.movePiece(direction);
		
		assertEquals(1, p1.getRow());
	}
	
	public void testMovePieceWin() {
		int [] direction = {1, 0};
		puzzle.selectPiece(1.5, 4.5, 1, 1);
		Move move = new Move(app, puzzle);
		move.movePiece(direction);
		
		assertTrue(puzzle.checkWin(direction, 1, 1));
	}
	
	protected void tearDown() {
		app.setVisible(false);
		app.dispose();
	}
	

}
