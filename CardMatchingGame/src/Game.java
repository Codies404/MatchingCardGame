import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game {

	public Game() {
		JFrame jf = new JFrame("Shape Master!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("New Game", JLabel.CENTER);
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// jf.setUndecorated(true);

		jf.add(label, BorderLayout.NORTH);
		JButton Easy = new JButton("Easy 5x5");
		Easy.setBounds(650, 300, 200, 200);
		JButton Normal = new JButton("Normal 8x8");
		Normal.setBounds(652, 502, 200, 200);
		JButton Hard = new JButton("Hard 10x10");
		Hard.setSize(new Dimension(50, 50));
		Hard.setLocation(500, 350);

		JTextField field = new JTextField(10);

		jf.add(field, BorderLayout.SOUTH);
		jf.add(Easy);
		jf.add(Normal);
		jf.add(Hard);
		field.setVisible(true);
		label.setVisible(true);
		jf.setVisible(true);
	}

}
