package controller;

import java.util.ArrayList;

import boundary.SliderApplication;
import entity.Model;
import entity.Piece;
import entity.Puzzle;
import junit.framework.TestCase;

public class TestExit extends TestCase{

	SliderApplication app;
	Model m;
	Puzzle puzzle;
	Piece p1, p2;
	
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
	
	public void testExit() {
		ExitApplication exit = new ExitApplication(app);
		exit.process();
	}
}
