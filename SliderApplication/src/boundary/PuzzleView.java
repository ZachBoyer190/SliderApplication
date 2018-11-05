package boundary;

import java.awt.Graphics;
import java.awt.Color;

import java.util.ArrayList;

import javax.swing.JPanel;

import entity.*;

public class PuzzleView extends JPanel{
	
	Model model;
	
	public PuzzleView(Model m) {	
		this.model = m;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		ArrayList<Piece> pieces = model.getPieces();
		for (Piece p : pieces) {
			
			// TODO: Make this helper function
			if (p.isGoal()) {
				g.setColor(Color.red);
			}
			else if (p == model.getActive()) {
				g.setColor(Color.green);
			}
			else {
				g.setColor(Color.black);
			}
			
			g.fillRect(p.getxCoord(), p.getyCoord(), p.getsizeX(), p.getsizeY());
			
			
		}
		
	}
	

}
