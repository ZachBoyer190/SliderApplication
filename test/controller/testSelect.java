package controller;

import java.util.ArrayList;

import boundary.SliderApplication;
import entity.Model;
import entity.Piece;
import entity.Puzzle;
import junit.framework.TestCase;

public class testSelect extends TestCase{

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
	
	public void testSelectNotSelected() {
		Select select = new Select(app, puzzle);
		select.selectPiece(139.2, 443.25);
		
		assertTrue(p2.isSelected());
	}
	
	public void testSelectedWhenSelected() {
		Select select = new Select(app, puzzle);
		select.selectPiece(139.2, 443.25);
		assertTrue(p2.isSelected());
		
		select.selectPiece(139.2, 0.5);
		assertTrue(p1.isSelected());
	}
	
	
	
	protected void tearDown() {
		app.setVisible(false);
		app.dispose();
	}
}
