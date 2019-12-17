import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JFrame {
	private Handler handler = new Handler();
	JPanel row1, row2, row3, row4, filler;
	JButton Easy, Normal, Hard, Back;

	public Game(Menu mn) {

		// making the JFrame
		JFrame jf = new JFrame("Shape Master!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1080, (1080 * 9) / 16);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);
		// jf.setUndecorated(true);

		JLabel label = new JLabel("New Game", JLabel.CENTER);
		jf.add(label, BorderLayout.NORTH);

		label.setVisible(true);
		JPanel row1 = new JPanel();
		JPanel row2 = new JPanel();
		JPanel row3 = new JPanel();
		JPanel row4 = new JPanel();
		JPanel filler = new JPanel();
		JButton Easy = new JButton("Easy");
		JButton Normal = new JButton("Normal");
		JButton Hard = new JButton("Hard");
		JButton Back = new JButton("Back");
		Easy.addActionListener(e -> {
			Grid grideasy = new Grid(5, 5);
			JFrame panel=new JFrame();
			panel.setLayout(new BorderLayout());
			panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panel.setExtendedState(JFrame.MAXIMIZED_BOTH);
			
			
			
			Container buttons =new Container();
			buttons.setLayout(new GridLayout());
						
			for(int i=0;i<25;i++)
			{
				JPanel holder =new JPanel();
				JButton b1 =new JButton();
				b1.addActionListener(a ->{
					holder.setVisible(false);
				});
				holder .add(b1);
				buttons.add(holder);
			}
			panel.add(grideasy,BorderLayout.CENTER);
			panel.add(buttons,BorderLayout.CENTER);
			panel.setUndecorated(true);
			panel.setLocationRelativeTo(null);
			
			panel.setResizable(false);
			panel.setVisible(true);
			
			
=======

		row1 = new JPanel();
		row2 = new JPanel();
		row3 = new JPanel();
		row4 = new JPanel();
		filler = new JPanel();
		Easy = new JButton("Easy");
		Normal = new JButton("Normal");
		Hard = new JButton("Hard");
		Back = new JButton("Back");
		Easy.addActionListener(e -> {
			new Grid(5, 5, this);
			jf.setVisible(false);
>>>>>>> branch 'master' of https://github.com/Codies404/MatchingCardGame.git

		});

		Normal.addActionListener(e -> {
<<<<<<< HEAD
			Grid gridnormal = new Grid(8, 8);
=======
			new Grid(8, 8, this);
			jf.setVisible(false);
>>>>>>> branch 'master' of https://github.com/Codies404/MatchingCardGame.git

		});

		Hard.addActionListener(e -> {
			new Grid(10, 10, this);
			jf.setVisible(false);

		});

		Back.addActionListener(e -> {
			jf.dispose();
			mn.setVisible();
		});
		JTextField name = new JTextField(50);
		name.addActionListener(handler);

		JLabel username = new JLabel("Enter Your name.", JLabel.NORTH_EAST);
		JLabel difficulty = new JLabel("Please choose difficulty.");
		
		Container pane = getContentPane();

		GridLayout layout = new GridLayout(6, 1);
		FlowLayout flowlayout = new FlowLayout();
		pane.setLayout(layout);
		row1.setLayout(flowlayout);
		row1.add(username);
		row1.add(name);

		row2.add(difficulty);
		row3.add(Easy);
		row3.add(Normal);
		row3.add(Hard);

		row4.add(Back);
		pane.add(filler);
		pane.add(row1);
		pane.add(row2);
		pane.add(row3);
		pane.add(row4);

		jf.add(pane);
		

	}

	public void setVisible(boolean show) {
		setVisible(true);
	}

}
