package boundary;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

import java.util.ArrayList;

import javax.swing.JPanel;

import entity.*;

public class PuzzleView extends JPanel{
	
	Puzzle puzzle;
	int panelHeight, panelWidth;
	
	int offset = 3;
	
	public PuzzleView(Puzzle p) {	
		this.puzzle = p;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g);
		
		panelHeight = getHeight() / 5;
		panelWidth = getWidth() / 4;

		for (Piece p : puzzle.getPieces()) {
			
			// TODO: Make this helper function
			if (p.isGoal()) {
				g.setColor(Color.red);
			}
			
			else {
				g.setColor(Color.gray);
			}
			
			g.fillRect(offset + p.getColumn()*panelWidth, offset + p.getRow()*panelHeight, (p.getsizeX() * panelWidth) - 2*offset, (p.getsizeY() * panelHeight) - 2*offset);
			
			//g.fillRect(offset+ c*boxWidth, offset + r*boxHeight, boxWidth-2*offset, boxHeight-2*offset);
			

		} 
		
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.black);
		g2.drawRect(0, 0, getWidth(), getHeight());
		
		g2.setColor(Color.blue);
		g2.drawLine(panelWidth, 5*panelHeight, 3*panelWidth, 5*panelHeight);
		
	}
	

}
