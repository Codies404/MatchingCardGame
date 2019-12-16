import java.awt.Graphics;
import java.util.Random;

public class Circle extends Shapes{
	
	private Random r = new Random();

	public Circle(int width, int height,int color) {
		super( width, height,color,0);
		shape = 4;
		
	}
	@Override
	public void render(Graphics g) {
		g.setColor(color);
		g.fillOval(8, 10, width-15, height-15);
		/*g.setColor(brightness(20));
		g.fillArc(10, 10, width-10, height-10,0,35);

		g.setColor(brightness((float)0.5));
		g.fillArc(10, 10, width-10, height-10,35,55);

		g.fillArc(10, 10, width-10, height-10,90,10);

		g.fillArc(10, 10, width-10, height-10,100,30);

		g.fillArc(10, 10, width-10, height-10,130,70);

		g.fillArc(10, 10, width-10, height-10,200,51);

		g.fillArc(10, 10, width-10, height-10,251,74);

		g.fillArc(10, 10, width-10, height-10,325,35);*/
		
		
		
	}
	


}
