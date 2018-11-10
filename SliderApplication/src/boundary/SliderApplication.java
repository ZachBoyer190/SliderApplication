package boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.ExitApplication;
import controller.Move;
import controller.Select;
import controller.Reset;

import entity.Piece;
import entity.Puzzle;
import entity.Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SliderApplication extends JFrame{
	
	/**
	 * 
	 */

	Puzzle puzzle;
	Model m;

	PuzzleView puzzleView;
	int numberMoves = 0;
	JLabel numMoves;
	
	/*
	 * Return all actionable elements in the GUI. As of now 
	 * this is only the number of moves that have been made
	 */
	
	public PuzzleView getPuzzleView() { return puzzleView; }
	public Puzzle getOriginalPuzzle() { return m.getOriginal(); }
	public void resetToOriginal(Puzzle p) { 
		puzzleView.updatePuzzle(p);
		puzzleView.repaint();
		}
	
	public void setMoves() { this.numberMoves++; }
	
	@SuppressWarnings("unused")
	private SliderApplication() {
		this(new Puzzle(new ArrayList<>()), new Model());
	}
	
	/**
	 * Create the application.
	 */
	public SliderApplication(Puzzle puzzle, Model m) {
		this.puzzle = puzzle;
		this.m = m;

		setBounds(100, 100, 657, 534);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		puzzleView = new PuzzleView(puzzle);
		puzzleView.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new Select(SliderApplication.this, puzzle).selectPiece(e.getX(),  e.getY());;
			}
		});

		JLabel lblMoves = new JLabel("Number of Moves:");
		
		JButton resetButton = new JButton("Reset Puzzle");
		// Register the action of hitting the reset button
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberMoves = 0;
				new Reset(SliderApplication.this).resetPuzzle();
				numMoves.setText(Integer.toString(numberMoves));
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("SliderApp");
		menuBar.add(mnFile);

		JMenuItem quitApp = new JMenuItem("Quit SliderApp");
		mnFile.add(quitApp);
		
		quitApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ExitApplication(SliderApplication.this).process();
			}
		});
		
		/*
		 * Move Buttons
		 */
		
		JButton upButton = new JButton("^");
		upButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] up = {-1, 0};
				new Move(SliderApplication.this, puzzle).movePiece(up);
				numMoves.setText(Integer.toString(numberMoves));
			}
		});
		
		JButton downButton = new JButton("v");
		downButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] down = {1, 0};
				new Move(SliderApplication.this, puzzle).movePiece(down);
				numMoves.setText(Integer.toString(numberMoves));
			}
		});
		
		JButton leftButton = new JButton("<");
		leftButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] left = {0, -1};
				new Move(SliderApplication.this, puzzle).movePiece(left);
				numMoves.setText(Integer.toString(numberMoves));
			}
		});
		
		JButton rightButton = new JButton(">");
		rightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] right = {0, 1};
				new Move(SliderApplication.this, puzzle).movePiece(right);
				numMoves.setText(Integer.toString(numberMoves));
			}
		});
		
		numMoves = new JLabel();
		numMoves.setText(Integer.toString(numberMoves));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(puzzleView, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(resetButton)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(upButton)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblMoves)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(numMoves)))
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addComponent(leftButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rightButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(74)
							.addComponent(downButton)))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMoves)
								.addComponent(numMoves))
							.addGap(28)
							.addComponent(resetButton)
							.addGap(159)
							.addComponent(upButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(leftButton)
								.addComponent(rightButton))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(downButton))
						.addComponent(puzzleView, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	
	
}

