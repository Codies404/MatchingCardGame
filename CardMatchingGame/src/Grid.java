import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JFrame {
	private int width, height;
	private Game game;
	private JFrame frame;
	private Container pane;
	private JPanel grid, card[][], gap1, gap2;
	private JButton button[][];
	private ArrayList<Card> tempList = new ArrayList<Card>();
	private CardLayout cl = new CardLayout();
	Random r = new Random();
	private int shapeSize = 93;

	public Grid(int width, int height, Game game) {
		this.width = width;
		this.height = height;
		this.game = game;
		card = new JPanel[width][height];
		button = new JButton[width][height];
		grid = new JPanel(new GridLayout(width, height, 5, 5));

		pane = getContentPane();
		pane.setLayout(new BorderLayout());

		setFrame();
		addShapes();
		gap1 = new JPanel();
		gap2 = new JPanel();
		gap1.setPreferredSize(new Dimension(400, 1000));
		gap2.setPreferredSize(new Dimension(400, 1000));
		pane.add(gap1, BorderLayout.WEST);
		pane.add(gap2, BorderLayout.EAST);
		pane.add(grid, BorderLayout.CENTER);
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				// creating the grid
				card[i][j] = new JPanel();

			}
		}
		int joker1, joker2;
		if (width < 6) {
			joker1 = r.nextInt(width * height);
			joker2 = -1;
		} else {
			joker1 = r.nextInt(width * height);
			joker2 = r.nextInt(width * height);
			while (joker1 == joker2) {
				joker2 = r.nextInt();
			}
		}
		int counter = 0;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				//we take from the list a random object (which exists twice in the list
				//the jokers are assigned to a specific cell before thus if we find that cell we just add a joker 
				if (counter == joker1 || counter == joker2) {
					Card cd = new Card(5, shapeSize, shapeSize, r.nextInt(5) + 1, 0);
					card[i][j].addMouseListener(cd);
					card[i][j].add(cd);
					grid.add(card[i][j]);
					j++;

				}
				int index;
				if(tempList.size() > 0)
					index = r.nextInt(tempList.size()); 
				else
					index = 0;
				Card cd = tempList.get(index);
				
				card[i][j].addMouseListener(cd);
				card[i][j].add(cd);
				grid.add(card[i][j]);
				

				counter++;
				tempList.remove(index);

			}

		}

	}

	private void setFrame() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setUndecorated(true);
		setVisible(true);
	}

	private void addShapes() {

		int color;
		int orientation;
		for (int i = 0; i < (width * height) / 2; i++) {
			int rand = r.nextInt(4);
			color = r.nextInt(4);
			if (rand == 0) {
				orientation = r.nextInt(4);
				// adding new triangle
				Card object = new Card(1, shapeSize, shapeSize, color, orientation);
				Card clone = new Card(1, shapeSize, shapeSize, color, orientation);

				tempList.add(object);
				tempList.add(clone);
			} else if (rand == 1) {
				orientation = r.nextInt(2);
				// adding new rectangle
				Card object = new Card(2, shapeSize, shapeSize, color, orientation);
				Card clone = new Card(2, shapeSize, shapeSize, color, orientation);

				tempList.add(object);
				tempList.add(clone);
			} else if (rand == 2) {
				orientation = r.nextInt(2);
				// adding new diamond
				Card object = new Card(3, shapeSize, shapeSize, color, orientation);
				Card clone = new Card(3, shapeSize, shapeSize, color, orientation);

				tempList.add(object);
				tempList.add(clone);
			} else if (rand == 3) {
				orientation = 0;
				// adding new circleS
				Card object = new Card(4, shapeSize, shapeSize, color, orientation);
				Card clone = new Card(4, shapeSize, shapeSize, color, orientation);

				tempList.add(object);
				tempList.add(clone);
			}
		}
		Collections.shuffle(tempList);

	}

}
