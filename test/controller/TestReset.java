package controller;

import java.util.ArrayList;

import boundary.SliderApplication;
import entity.Model;
import entity.Piece;
import entity.Puzzle;
import junit.framework.TestCase;

public class TestReset extends TestCase{

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
		m.setOriginal(puzzle);
		app = new SliderApplication(puzzle, m);
		app.setVisible(true);
	}
	
	public void testReset() {
		Reset reset = new Reset(app);
		int [] direction = {-2, 0};
		puzzle.selectPiece(1.5, 4.5, 1, 1);
		puzzle.movePiece(direction, 1, 1);
		
		assertEquals(2, p2.getRow());
		
		reset.resetPuzzle();
		
		Puzzle after = m.getOriginal();
		ArrayList<Piece> afterPieces = new ArrayList<>();
		afterPieces = after.getPieces();
		
		assertEquals(4, afterPieces.get(1).getRow());
	}
	
	protected void tearDown() {
		app.setVisible(false);
		app.dispose();
	}
	
	
}
