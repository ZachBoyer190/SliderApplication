package entity;

import boundary.SliderApplication;
import java.util.ArrayList;

/*
 * Controller Class for the high level model
 */

public class Model {
	
	SliderApplication app;
	Puzzle original;
	
	public Model() {
	}
	
	public void setOriginal(Puzzle p) {
		this.original = p.deepCopy(p);
	}
	
	public Puzzle getOriginal() {
		return original;
	}


	
}
