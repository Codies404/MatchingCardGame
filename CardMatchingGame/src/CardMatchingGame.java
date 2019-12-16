import javax.swing.JFrame;

public class CardMatchingGame {
	
	private final static int WIDTH = 1080, HEIGHT = (WIDTH * 9) / 16; // the size of the window will have a resolution of 16:9 ratio
	private static Card temp ;
	private static JFrame f;
	
	public static void main(String[] args) {
			new Menu("Shape Master");
			//5(joker ) the fourth parameter translates into shape since joker doesnt need to specify color
			
			/*temp = new Card(5,100,100,3,0);
			f = new JFrame();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(200,200);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			f.addMouseListener(temp);
			f.add(temp);*/
			
				
	}

}
