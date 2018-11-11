package controller;

import entity.Puzzle;
import entity.Model;

import boundary.SliderApplication;

public class Reset {
	
	SliderApplication app;
	Model m;
	
	public Reset(SliderApplication app) {
		this.app = app;
	}
	
	public void resetPuzzle() {
		Puzzle originalPuzzle = app.getOriginalPuzzle();
		app.resetToOriginal(originalPuzzle);
	}

}
