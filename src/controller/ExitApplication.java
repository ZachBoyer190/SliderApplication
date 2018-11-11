package controller;

import javax.swing.*;

/*
 * From ExitApplicationController in CircleDrawer
 */

public class ExitApplication {
	JFrame app;
	
	public ExitApplication(JFrame app) {
		this.app = app;
	}
	
	public void process() {
		int c = JOptionPane.showConfirmDialog(app, "Are you sure you'd like to quit?");
		
		if(c == JOptionPane.OK_OPTION) {
			app.setVisible(false);
			app.dispose();
		}
				
	}
	
}
