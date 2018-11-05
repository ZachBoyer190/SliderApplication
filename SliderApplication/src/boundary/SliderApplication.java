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

import entity.Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class SliderApplication extends JFrame{
	
	Model model;

	JFrame frame;
	PuzzleView puzzleView;
	JTextField numMoves;
	
	/*
	 * Return all actionable elements in the GUI. As of now 
	 * this is only the number of moves that have been made
	 */
	
	public JTextField getNumMoves() { return numMoves; }
	
	
	/**
	 * Create the application.
	 */
	public SliderApplication(Model model) {
		this.model = model;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 657, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		puzzleView = new PuzzleView(model);

		JLabel lblMoves = new JLabel("Number of Moves:");
		
		JButton resetButton = new JButton("Reset Puzzle");
		// Register the action of hitting the reset button
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add class call here to perform reset
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("SliderApp");
		menuBar.add(mnFile);
		
		// TODO: Add functionality to save and open previous puzzles
		
		/*
		JMenuItem mntmSave = new JMenuItem("Save...");
		mnFile.add(mntmSave);

		JMenuItem mntmOpen = new JMenuItem("Open...");
		mnFile.add(mntmOpen);
		*/
		
		JMenuItem quitApp = new JMenuItem("Quit SliderApp");
		mnFile.add(quitApp);
		
		quitApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add class call to quit application here
			}
		});
		
		numMoves = new JTextField();
		numMoves.setColumns(10);
		
		/*
		 * Move Buttons
		 */
		
		JButton upButton = new JButton("^");
		upButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		
		JButton downButton = new JButton("v");
		downButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton leftButton = new JButton("<");
		leftButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		
		JButton rightButton = new JButton(">");
		rightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(puzzleView, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblMoves)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(numMoves, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(upButton)
									.addComponent(resetButton)
									.addComponent(downButton))))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(leftButton)
							.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
							.addComponent(rightButton)))
					.addContainerGap())
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
								.addComponent(numMoves, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addComponent(resetButton)
							.addGap(153)
							.addComponent(upButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(leftButton)
								.addComponent(rightButton))
							.addGap(10)
							.addComponent(downButton))
						.addComponent(puzzleView, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);

	}
}

