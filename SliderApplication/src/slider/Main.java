package slider;

import entity.*;
import controller.ExitApplication;
import boundary.SliderApplication;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Piece p1 = new Piece(0, 0, 1, 2, false, false);
		Piece p2 = new Piece(2, 0, 1, 2, false, false);
		Piece p3 = new Piece(2, 1, 1, 1, false, false);
		Piece p4 = new Piece(3, 1, 1, 1, false, false);
		Piece p5 = new Piece(2, 2, 1, 1, false, false);
		Piece p6 = new Piece(3, 2, 1, 1, false, false);
		Piece p7 = new Piece(0, 3, 1, 2, false, false);
		Piece p8 = new Piece(2, 3, 1, 2, false, false);
		Piece p9= new Piece(4, 1, 2, 1, false, false);
		Piece pGoal = new Piece(0, 1, 2, 2, true, false);
		//Piece pGoal = new Piece(3, 1, 2, 2, true, false);
		
		ArrayList<Piece> pieces = new ArrayList<>();
		pieces.add(p1);
		pieces.add(p2);
		pieces.add(p3);
		pieces.add(p4);
		pieces.add(p5);
		pieces.add(p6);
		pieces.add(p7);
		pieces.add(p8);
		pieces.add(p9);
		pieces.add(pGoal);
		
		//ArrayList<Piece> pieces = randomize();
		
		Puzzle puzzle = new Puzzle(pieces);
		Model m = new Model();
		m.setOriginal(puzzle);
		
		SliderApplication app = new SliderApplication(puzzle, m);
		app.addWindowListener (new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				new ExitApplication(app).process();
			}

		});
		
		app.setVisible(true);
		
	}
	
	public static ArrayList<Piece> randomize() {
		Random rand = new Random();
		int value = rand.nextInt(3);
		ArrayList<Piece> pieces = new ArrayList<>();
		
		if (value == 0) {
			Piece p1 = new Piece(0, 0, 1, 2, false, false);
			Piece p2 = new Piece(2, 0, 1, 2, false, false);
			Piece p3 = new Piece(2, 1, 1, 1, false, false);
			Piece p4 = new Piece(3, 1, 1, 1, false, false);
			Piece p5 = new Piece(2, 2, 1, 1, false, false);
			Piece p6 = new Piece(3, 2, 1, 1, false, false);
			Piece p7 = new Piece(0, 3, 1, 2, false, false);
			Piece p8 = new Piece(2, 3, 1, 2, false, false);
			Piece p9= new Piece(4, 1, 2, 1, false, false);
			Piece pGoal = new Piece(0, 1, 2, 2, true, false);

			pieces.add(p1);
			pieces.add(p2);
			pieces.add(p3);
			pieces.add(p4);
			pieces.add(p5);
			pieces.add(p6);
			pieces.add(p7);
			pieces.add(p8);
			pieces.add(p9);
			pieces.add(pGoal);
		}
		else if (value == 1) {
			Piece p1 = new Piece(0, 0, 1, 1, false, false);
			Piece p2 = new Piece(0, 3, 1, 1, false, false);
			Piece p3 = new Piece(1, 0, 1, 2, false, false);
			Piece p4 = new Piece(1, 3, 1, 2, false, false);
			Piece p5 = new Piece(2, 1, 1, 2, false, false);
			Piece p6 = new Piece(3, 0, 1, 1, false, false);
			Piece p7 = new Piece(3, 3, 1, 1, false, false);
			Piece p8 = new Piece(4, 0, 2, 1, false, false);
			Piece p9= new Piece(4, 2, 2, 1, false, false);
			Piece pGoal = new Piece(0, 1, 2, 2, true, false);

			pieces.add(p1);
			pieces.add(p2);
			pieces.add(p3);
			pieces.add(p4);
			pieces.add(p5);
			pieces.add(p6);
			pieces.add(p7);
			pieces.add(p8);
			pieces.add(p9);
			pieces.add(pGoal);
			
		}
		else if (value == 2) {
			Piece p1 = new Piece(0, 0, 1, 2, false, false);
			Piece p2 = new Piece(2, 0, 1, 2, false, false);
			Piece p3 = new Piece(0, 1, 1, 1, false, false);
			Piece p4 = new Piece(0, 2, 1, 1, false, false);
			Piece p5 = new Piece(0, 3, 1, 1, false, false);
			Piece p6 = new Piece(1, 1, 1, 2, false, false);
			Piece p7 = new Piece(3, 1, 2, 1, false, false);
			Piece p8 = new Piece(3, 3, 1, 1, false, false);
			Piece p9= new Piece(4, 2, 2, 1, false, false);
			Piece pGoal = new Piece(1, 2, 2, 2, true, false);

			pieces.add(p1);
			pieces.add(p2);
			pieces.add(p3);
			pieces.add(p4);
			pieces.add(p5);
			pieces.add(p6);
			pieces.add(p7);
			pieces.add(p8);
			pieces.add(p9);
			pieces.add(pGoal);
			
		}
		else if (value == 3) {
			Piece p1 = new Piece(0, 0, 1, 2, false, false);
			Piece p2 = new Piece(2, 0, 1, 2, false, false);
			Piece p3 = new Piece(4, 0, 1, 1, false, false);
			Piece p4 = new Piece(2, 1, 2, 1, false, false);
			Piece p5 = new Piece(3, 1, 1, 1, false, false);
			Piece p6 = new Piece(3, 2, 1, 1, false, false);
			Piece p7 = new Piece(0, 3, 1, 2, false, false);
			Piece p8 = new Piece(2, 3, 1, 2, false, false);
			Piece p9= new Piece(4, 3, 1, 1, false, false);
			Piece pGoal = new Piece(0, 1, 2, 2, true, false);

			pieces.add(p1);
			pieces.add(p2);
			pieces.add(p3);
			pieces.add(p4);
			pieces.add(p5);
			pieces.add(p6);
			pieces.add(p7);
			pieces.add(p8);
			pieces.add(p9);
			pieces.add(pGoal);
			
		}
		
		return pieces;
		
	}

}
