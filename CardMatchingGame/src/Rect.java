import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Shapes {

	public Rect( int width, int height) {
		super( width, height);
		orientation = r.nextInt(1);
		shape = 2;
	}
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(color);
		if(orientation == 0 ) {
			g.fillRect(width/4, height/10, width - 2*width/4, height - 2*height/10);
		}else if (orientation == 1) {
			g.fillRect(width/10,height/4,width - 2*width/10,height - 2*height/4);
		}		
	}

}
