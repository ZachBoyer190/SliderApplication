package entity;

import junit.framework.TestCase;
import java.util.ArrayList;

public class TestPuzzle extends TestCase { 

	public void testCreate() {
		Piece p1 = new Piece(0, 1, 2, 1, false, true);
		Piece p2 = new Piece(1, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		Puzzle puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		
		assertEquals(puzzleArray, puzzle.getPieces());
	}
	
	public void testSelect() {
		Piece p1 = new Piece(0, 1, 2, 1, false, true);
		Piece p2 = new Piece(1, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		Puzzle puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		
		assertTrue(puzzle.selectPiece(1.5, 1.5, 1, 1));
	}
	
	public void testHasSelected() {
		Piece p1 = new Piece(0, 1, 2, 1, false, true);
		Piece p2 = new Piece(1, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		Puzzle puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		
		puzzle.selectPiece(1.5, 1.5, 1, 1);
		assertTrue(puzzle.hasSelected());
	}
	
	public void testDeselect() {
		Piece p1 = new Piece(0, 1, 2, 1, false, false);
		Piece p2 = new Piece(1, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		Puzzle puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		
		puzzle.selectPiece(1.5, 1.5, 1, 1);
		assertTrue(puzzle.hasSelected());
		
		puzzle.deselect();
		assertFalse(puzzle.hasSelected());
	}
	
	public void testFindSelected() {
		Piece p1 = new Piece(0, 1, 2, 1, false, false);
		Piece p2 = new Piece(4, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		Puzzle puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		puzzle.selectPiece(1.2, 4.2, 1, 1);
		
		assertEquals(p2, puzzle.findSelected());
	}
	
	public void testWinCondition() {
		Piece p1 = new Piece(0, 1, 2, 1, false, false);
		Piece p2 = new Piece(4, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		Puzzle puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		puzzle.selectPiece(1.5, 4.5, 1, 1);
		int [] direction = {1, 0};
		
		assertTrue(puzzle.checkWin(direction, 1, 1));
	}
	
	public void testValidMove() {
		Piece p1 = new Piece(0, 1, 2, 1, false, false);
		Piece p2 = new Piece(1, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		Puzzle puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		puzzle.selectPiece(1.5, 1.5, 1, 1);
		int [] direction = {1, 0};
		
		assertTrue(puzzle.checkMove(direction, 1, 1));
	}

	public void testDeepCopy() {
		Piece p1 = new Piece(0, 1, 2, 1, false, true);
		Piece p2 = new Piece(1, 1, 1, 1, true, false);
		ArrayList<Piece> puzzleArray = new ArrayList<>();
		Puzzle puzzle = new Puzzle(puzzleArray);
		puzzleArray.add(p1);
		puzzleArray.add(p2);
		Model m = new Model();
		
		m.setOriginal(puzzle);
		assertNotSame(puzzle.deepCopy(puzzle), m.getOriginal());
	}
}
