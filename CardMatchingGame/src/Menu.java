import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{

	private static final long serialVersionUID = 3186532921024077905L;

	public Menu(String title,int width,int height) {
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(2,6));
		
		JButton newGame = new JButton("New Game");
		JButton profile = new JButton("Profile");
		JButton highScores = new JButton("high scores");
		JButton help = new JButton("help");
		JButton credits = new JButton("credits");
		JButton exit = new JButton("exit");
		
		JPanel row1=new JPanel();
		row1.setLayout(new FlowLayout());
		JPanel row2=new JPanel();
		row2.setLayout(new FlowLayout());
		row2.add(newGame);
		JPanel row3=new JPanel();
		row3.add(profile,highScores);
		row3.setLayout(new FlowLayout());
		JPanel row4=new JPanel();

		row4.setLayout(new FlowLayout());
		JPanel row5=new JPanel();
		row5.setLayout(new FlowLayout());
		
		
		row3.add(profile);
		row3.add(highScores);
		row4.add(help);
		row4.add(credits);
		row5.add(exit);
		
		pane.add(row1);
		pane.add(row2);
		pane.add(row3);
		pane.add(row4);
		pane.add(row5);
		
		
		setContentPane(pane);
		pack();
		frame.add(pane);
		
		
		
		

		
	}
}
