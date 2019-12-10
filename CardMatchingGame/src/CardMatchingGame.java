import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class CardMatchingGame {

	private final static int WIDTH = 1080, HEIGHT = (WIDTH * 9) / 16; // the size of the window will have a resolution of 16:9 ratio
															

	public static void main(String[] args) {
		ArrayList<Shapes> shapes = new ArrayList<Shapes>();
		Random r = new Random();		
		shapes.add(new Diamond(200,200));
		shapes.add(new Rect(200,200));
		shapes.add(new Circle(200,200));
		shapes.add(new Triangle(200,200));
		
		new Menu("Shape Master");
		JFrame f = new JFrame();
		Shapes temp = shapes.get(r.nextInt(shapes.size()));
		
		
		
		f.setSize(200,235);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.add(temp);
        f.setVisible(true);

	}

}
