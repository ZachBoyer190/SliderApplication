package entity;

import junit.framework.TestCase;;

public class TestPiece extends TestCase{
	
	public void testCreatePiece() {
		Piece p = new Piece(0, 1, 2, 1, true, false);
		assertEquals(0, p.getRow());
		assertEquals(1, p.getColumn());
		assertEquals(2, p.getsizeX());
		assertEquals(1, p.getsizeY());
		assertTrue(p.isGoal());
		assertFalse(p.isSelected());
	}
	
	public void testPieceSelectSetter() {
		Piece p = new Piece(0, 1, 2, 1, true, false);
		p.setSelected(true);
		assertTrue(p.isSelected());
	}
	
	public void testPieceRowSetter() {
		Piece p = new Piece(0, 1, 2, 1, true, false);
		p.setRow(5);
		assertEquals(5, p.getRow());
	}
	 
	public void testPieceColumnSetter() {
		Piece p = new Piece(0, 1, 2, 1, true, false);
		p.setColumn(6);
		assertEquals(7, p.getColumn());
	}

}
