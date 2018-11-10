package controller;

import javax.swing.*;

public class WinApplication {
	JFrame app;
	
	public WinApplication(JFrame app) {
		this.app = app;
	}
	
	public void process() {
		int c = JOptionPane.showConfirmDialog(app, "Congratulations! Would you like to play again?");
		
		if(c == JOptionPane.OK_OPTION) {
			//new Reset(app)

		} else {
			
		}
	}

}
