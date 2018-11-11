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
		PuzzleView view = app.getPuzzleView();
		if (puzzle.hasSelected()) {
			if (puzzle.checkWin(direction, view.getHeight() / 5, view.getWidth() / 4)) {
				new WinApplication(app, app).process();
			} else {
			puzzle.movePiece(direction, view.getHeight() / 5, view.getWidth() / 4);
			app.setMoves();
			view.repaint();
		}
		}
	}

}
