package controller;

import entity.Puzzle;
import entity.Model;

import boundary.SliderApplication;
import boundary.PuzzleView;

public class Reset {
	
	Puzzle puzzle;
	SliderApplication app;
	Model m;
	
	public Reset(SliderApplication app, Puzzle puzzle) {
		this.app = app;
		this.puzzle = puzzle;
	}
	
	public void resetPuzzle() {
		Puzzle original = m.getOriginalPuzzle();
		
	}

}
