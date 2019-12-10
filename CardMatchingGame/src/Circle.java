import java.awt.Graphics;

public class Circle extends Shapes{

	public Circle(int width, int height,int color) {
		super( width, height,color,0);
		shape = 3;
		
	}
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillOval(10, 10, width-10, height-10);		
	}

}
