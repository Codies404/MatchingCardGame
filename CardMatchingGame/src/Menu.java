import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel row1 ,row2, row3,row4,row5;
	private JLabel menu;
	private JButton newGame;
	private JButton profile;
	private JButton highScore;
	private JButton help;
	private JButton credits;
	private JButton exit;


	public Menu(String title,int width,int height) {
		super(title);
		setSize(width,height);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		row1 = new JPanel();
		menu = new JLabel("menu");
		
		row2 = new JPanel();
		newGame = new JButton("NEW GAME");
		newGame.addActionListener(e-> {
			new Game();
			dispose();
		});
		
		row3 = new JPanel();
		profile = new JButton("User Profile");
		highScore = new JButton("High Scores");
		
		row4 = new JPanel();
		help = new JButton("Help");
		credits = new JButton("Credits");
		
		row5 = new JPanel();
		exit = new JButton("EXIT");
		exit.addActionListener(e -> System.exit(0));
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(6,1));
		
		FlowLayout fl = new FlowLayout();
		row1.setLayout(fl);
		row1.add(menu);
		
		row2.setLayout(fl);
		row2.add(newGame);
		
		row3.setLayout(fl);
		row3.add(profile);
		row3.add(highScore);
		
		row4.setLayout(fl);
		row4.add(help);
		row4.add(credits);
		
		row5.setLayout(fl);
		row5.add(exit);
		
		pane.add(row1);
		pane.add(row2);
		pane.add(row3);
		pane.add(row4);
		pane.add(row5);
		
		setContentPane(pane);
		pack();
	}
}
