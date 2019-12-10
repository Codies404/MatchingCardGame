import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JFrame {
	// the size of the grid
	private int x, y;
	ArrayList<Shapes> shape = new ArrayList<Shapes>();
	ArrayList<Shapes> templist = new ArrayList<Shapes>();
	ArrayList<Shapes> templist2 = new ArrayList<Shapes>();
	Random r = new Random();

	Grid(int x, int y) {
		this.x = x;
		this.y = y;

		createLists();

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
		boolean jokerExist = false;

		for (int i = 0; i < templist.size(); i++) {
			if (!jokerExist) {
				JPanel jcard = new JPanel();
				jcard.setLayout(new CardLayout());
				jcard.add(new Joker(25, 25));
			}
			JPanel card = new JPanel();
			card.setLayout(new CardLayout());

			Shapes temp = templist.get(i);
			card.add(temp);
			pane.add(card);
		}
		for (int i = 0; i < templist2.size(); i++) {
			if (!jokerExist) {
				JPanel jcard = new JPanel();
				jcard.setLayout(new CardLayout());
				jcard.add(new Joker(25, 25));
			}
			JPanel card = new JPanel();
			card.setLayout(new CardLayout());

			Shapes temp = templist2.get(i);
			card.add(temp);
			pane.add(card);
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

	private void createLists() {
		// creting temp list1
		Shapes tmp;
		for (int i = 0; i < (x * y-1) / 2; i++) {
			int rand = r.nextInt(4);
			int color = r.nextInt(4);
			if (rand == 0) {

				templist.add(new Circle(25, 25, color));
				templist2.add(new Circle(25, 25, color));

			} else if (rand == 1) {
				int orientation = r.nextInt(1);

				templist.add(new Rect(25, 25, color, orientation));
				templist2.add(new Rect(25, 25, color, orientation));

			} else if (rand == 2) {
				int orientation = r.nextInt(4);

				templist.add(new Triangle(25, 25, color, orientation));
				templist2.add(new Triangle(25, 25, color, orientation));

			} else if (rand == 3) {
				int orientation = r.nextInt(2);

				templist.add(new Diamond(25, 25, color, orientation));
				templist2.add(new Diamond(25, 25, color, orientation));

			}

		}

	}

}
