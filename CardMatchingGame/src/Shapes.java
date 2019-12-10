import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Shapes extends JPanel{
	protected Random r = new Random();
	protected int shape,orientation,width,height;
	protected Color color;
	protected Color colors[] = {new Color(51,204,204),new Color(0,204,153),new Color(255,204,102),new Color(200,80,80)};
	
	
	public Shapes(int width , int height) {
		super();
		this.width = width;
		this.height = height;	
		this.color = colors[r.nextInt(3)];
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawString("no shape here",width/2,100);
	}
	
	public int getOrientation() {return orientation;}
	public int getShape() {return shape;}
	public int getColor() {
		for(int i = 0 ; i < colors.length ; i++) {
			if(colors[i].getRGB() == this.color.getRGB()) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public int hashCode() {
		return getColor()*orientation*shape;
		
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Shapes)) return false;
		if(o == null) return false;
		
		Shapes temp = (Shapes) o;
		if(temp.getOrientation() != orientation) return false;
		if(temp.getShape() != shape) return false;
		if(temp.getColor() != this.getColor()) return false;
		return true;
		
	}



}
