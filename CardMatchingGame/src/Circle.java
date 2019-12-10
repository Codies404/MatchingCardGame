import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shapes{

	public Circle(int width, int height) {
		super( width, height);
		shape = 3;
		
	}
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillOval(10, 10, width-20, height-20);		
	}

}
