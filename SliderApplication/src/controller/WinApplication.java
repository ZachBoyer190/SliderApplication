package controller;

import javax.swing.*;
import boundary.SliderApplication;

public class WinApplication {
	JFrame app;
	SliderApplication slider;
	
	public WinApplication(JFrame app, SliderApplication slider) {
		this.app = app;
		this.slider = slider;
	}
	
	public void process() {
		int c = JOptionPane.showConfirmDialog(app, "Congratulations! Would you like to play again?");
		
		if(c == JOptionPane.OK_OPTION) {
			new Reset(slider).resetPuzzle();

		} else {
			
		}
	}

}
