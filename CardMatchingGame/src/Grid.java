import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JFrame {

	Grid(int x, int y) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout layout = new GridLayout(x, y);
		BorderLayout border = new BorderLayout(300, 5);
		FlowLayout flow = new FlowLayout();
		Container pane = getContentPane();
		JPanel filler = new JPanel();
		JPanel filler2 = new JPanel();
		JPanel filler3 = new JPanel();
		JPanel filler4 = new JPanel();

		pane.setLayout(new GridLayout(x, y,5,5));
		pane.setSize(499, 499);

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {

				JButton button = new JButton();
				
				pane.add(button);
			}
		}

		frame.setLayout(border);

		frame.setSize(1080, (1080 * 9) / 16);
		frame.setLocationRelativeTo(null);
		frame.add(filler4, BorderLayout.SOUTH);
		frame.add(filler3, BorderLayout.NORTH);
		frame.add(filler2, BorderLayout.WEST);
		frame.add(filler, BorderLayout.EAST);
		frame.add(pane, BorderLayout.CENTER);
		frame.setResizable(false);
		frame.setVisible(true);

	}

}
