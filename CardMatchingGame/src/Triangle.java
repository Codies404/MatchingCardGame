import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Triangle extends Shapes {

	public Triangle(int width,int height) {
		super(width,height);
		orientation = r.nextInt(3);
		shape = 1; // not starting from 0 since we need that to create a hashcode and multiplying with 0 wont work
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(color);
		if(orientation == 0 ) {
			g.fillPolygon(new int[] {0,0,height/2} , new int[] {0,width/2,0} , 3);
		}else if (orientation == 1) {
			g.fillPolygon(new int[] {width/2,width,width} , new int[] {0,height/2,0} , 3);
		}else if (orientation == 2 ) {
			g.fillPolygon(new int[] {0,0,width/2} , new int[] {height/2,height,height} , 3);
		}else if (orientation == 3) {
			g.fillPolygon(new int[] {width,width/2,width} , new int[] {height/2,height,height} , 3);
		}
		
	}
}
