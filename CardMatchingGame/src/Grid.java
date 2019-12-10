import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JFrame {
	Random r = new Random();

	Grid(int x, int y) {

		ArrayList<Shapes> shape = new ArrayList<Shapes>();
		ArrayList<Shapes> templist = new ArrayList<Shapes>();
		ArrayList<Shapes> templist2 = new ArrayList<Shapes>();

		

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BorderLayout border = new BorderLayout(300, 10);

		Container pane = getContentPane();
		JPanel filler = new JPanel();
		JPanel filler2 = new JPanel();
		JPanel filler3 = new JPanel();
		JPanel filler4 = new JPanel();

		pane.setLayout(new GridLayout(x, y, 5, 5));
		pane.setSize(500, 500);

		for (int i = 0; i < templist.size(); i++) {

			JPanel panel = new JPanel();
			panel.setLayout(new CardLayout());

			Shapes temp = templist.get(i);
			panel.add(temp);

			pane.add(panel);

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
