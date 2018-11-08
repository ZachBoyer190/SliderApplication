package slider;

import entity.*;
import controller.ExitApplication;
import boundary.SliderApplication;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Piece p1 = new Piece(0, 0, 1, 2, false);
		Piece p2 = new Piece(2, 0, 1, 2, false);
		Piece p3 = new Piece(2, 1, 1, 1, false);
		Piece p4 = new Piece(3, 1, 1, 1, false);
		Piece p5 = new Piece(2, 2, 1, 1, false);
		Piece p6 = new Piece(3, 2, 1, 1, false);
		Piece p7 = new Piece(0, 3, 1, 2, false);
		Piece p8 = new Piece(2, 3, 1, 2, false);
		Piece p9= new Piece(4, 1, 2, 1, false);
		Piece pGoal = new Piece(0, 1, 2, 2, true);
		
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
		
		Puzzle puzzle = new Puzzle(pieces);
		
		SliderApplication app = new SliderApplication(puzzle);
		app.addWindowListener (new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				new ExitApplication(app).process();
			}

		});
		
		app.setVisible(true);
		
	}

}
