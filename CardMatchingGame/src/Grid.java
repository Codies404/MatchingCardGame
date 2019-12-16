import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JPanel {
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
		Collections.shuffle(templist);
		Collections.shuffle(templist2);
		JPanel frame = new JPanel();
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

		BorderLayout border = new BorderLayout(300, 10);

		Container pane = new Container();
		JPanel filler = new JPanel();
		JPanel filler2 = new JPanel();
		JPanel filler3 = new JPanel();
		JPanel filler4 = new JPanel();

		pane.setLayout(new GridLayout(x, y, 5, 5));

		int joker1;
		int joker2;
		if (x < 6) {
			joker1 = r.nextInt(25);
			joker2 = 100;
		} else if (x < 10) {
			joker1 = r.nextInt(64);
			joker2 = r.nextInt(64);
		} else {
			joker1 = r.nextInt(100);
			joker2 = r.nextInt(100);
		}

		for (int i = 0; i < templist.size(); i++) {
			if (i == joker1) {
				JPanel card = new JPanel();
				card.setLayout(new CardLayout());
				Shapes temp = new Joker(93, 93);
				card.add(temp);
				pane.add(card);

				joker1 = -2;
				i--;
				continue;
			}
			if (x > 6 && i == joker2) {
				JPanel card = new JPanel();
				card.setLayout(new CardLayout());
				Shapes temp = new Joker(93, 93);
				card.add(temp);
				pane.add(card);

				joker2 = -2;
				i--;
				continue;
			}
			JPanel card = new JPanel();
			card.setLayout(new CardLayout());
			Shapes temp = templist.get(i);
			card.add(temp);
			pane.add(card);
		}

		for (int i = 0; i < templist2.size(); i++) {
			if (i == joker1 % x) {
				JPanel card = new JPanel();
				card.setLayout(new CardLayout());
				Shapes temp = new Joker(93, 93);
				card.add(temp);
				pane.add(card);

				joker1 = -2;
				i--;
				continue;
			}
			if (x > 6 && i == joker2 % x) {
				JPanel card = new JPanel();
				card.setLayout(new CardLayout());
				Shapes temp = new Joker(93, 93);
				card.add(temp);
				pane.add(card);

				joker2 = -2;
				i--;
				continue;
			}

			JPanel card = new JPanel();
			card.setLayout(new CardLayout());
			Shapes temp = templist2.get(i);
			card.add(temp);
			pane.add(card);
		}

		frame.setLayout(border);
		/*frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);*/
		frame.add(filler4, BorderLayout.SOUTH);
		frame.add(filler3, BorderLayout.NORTH);
		frame.add(filler2, BorderLayout.WEST);
		frame.add(filler, BorderLayout.EAST);
		frame.add(pane, BorderLayout.CENTER);
		/*frame.setResizable(false);
		frame.setVisible(true);*/
		

	}

	private void createLists() {
		// creting temp list1
		int cardSize = 93;
		Shapes tmp;
		for (int i = 0; i < (x * y - 1) / 2; i++) {
			int rand = r.nextInt(4);
			int color = r.nextInt(4);
			if (rand == 0) {

				templist.add(new Circle(cardSize, cardSize, color));
				templist2.add(new Circle(cardSize, cardSize, color));

			} else if (rand == 1) {
				int orientation = r.nextInt(2);

				templist.add(new Rect(cardSize, cardSize, color, orientation));
				templist2.add(new Rect(cardSize, cardSize, color, orientation));

			} else if (rand == 2) {
				int orientation = r.nextInt(4);

				templist.add(new Triangle(cardSize, cardSize, color, orientation));
				templist2.add(new Triangle(cardSize, cardSize, color, orientation));

			} else if (rand == 3) {
				int orientation = r.nextInt(2);

				templist.add(new Diamond(cardSize, cardSize, color, orientation));
				templist2.add(new Diamond(cardSize, cardSize, color, orientation));

			}

		}

	}

}
