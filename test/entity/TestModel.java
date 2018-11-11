package entity;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TestModel extends TestCase {

	public void testSetOriginal() {
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
