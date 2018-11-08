package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.*;
import entity.Puzzle;

public class Select extends MouseAdapter{
	SliderApplication app;
	Puzzle puzzle;
	
	public Select(SliderApplication app, Puzzle puzzle) {
		this.app = app;
		this.puzzle = puzzle;
	}
	
	public void selectPiece(double x, double y) {
		if (puzzle.hasSelected()) {
			return;
		} else {
			puzzle.selectPiece(x, y, 92.8, 98.5);
			PuzzleView view = app.getPuzzleView();
			view.repaint();
		}
		
	}
	
	

}
