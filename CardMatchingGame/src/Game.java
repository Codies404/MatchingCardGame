import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JFrame {

	public Game(Menu mn) {
		Handler handler;
		handler = new Handler();

		JFrame jf = new JFrame("Shape Master!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("New Game", JLabel.CENTER);
		jf.setSize(1080, (1080 * 9) / 16);
		// jf.setUndecorated(true);
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
		Easy.addActionListener(e_ -> {
			Grid grideasy = new Grid(5, 5);

		});

		Normal.addActionListener(e_ -> {
			Grid gridnormal = new Grid(8, 8);

		});

		Hard.addActionListener(e_ -> {
			Grid gridhard = new Grid(10, 10);

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
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		jf.setVisible(true);

	}

}
