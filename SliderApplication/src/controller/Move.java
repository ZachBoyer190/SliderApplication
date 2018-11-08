package controller;

import boundary.PuzzleView;
import boundary.SliderApplication;
import entity.Puzzle;

public class Move {
	
	SliderApplication app;
	Puzzle puzzle;
	
	public Move(SliderApplication app, Puzzle puzzle) {
		this.app = app;
		this.puzzle = puzzle;
	}
	
	public void movePiece(int[] direction) {
		if (puzzle.hasSelected()) {
			puzzle.movePiece(direction);
			PuzzleView view = app.getPuzzleView();
			view.repaint();
		}
	}
	
	//public boolean validMove(int[] direction) {
		
	//}
}
