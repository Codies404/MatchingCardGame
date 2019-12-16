import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class CardBack extends JPanel {
	private int width ,height;
	
	public CardBack(int width,int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void paintBack(Graphics g) {
		try {
			Image image = Toolkit.getDefaultToolkit().getImage("polygon-wallpaper-18.jpg");
			g.drawImage(image, 0, 0,width,height, null);
		}catch(Exception e) {
			System.out.println("Image not foung");
		}
		
	}
}
