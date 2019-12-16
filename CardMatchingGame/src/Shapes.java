import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Shapes extends JPanel{
	protected Random r = new Random();
	protected int shape,orientation,width,height;
	protected int i = 0;
	protected Color color;		// red				//blue				//green 		//yellow
	protected Color colors[] = {new Color(255,0,0),new Color(0,0,255),new Color(0,255,0),new Color(255,225,0)};
	
	
	public Shapes(int width , int height,int color ,int orientation ) {
		super();
		this.width = width;
		this.height = height;	
		this.color = colors[color];
		this.orientation = orientation;
	}
	protected void render(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(0, 0, 200, 200);
		g.drawString("no shape here",0,0);
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
	//if everything is max then the color is white
	//thus by increasing the smaller values in the rgb it makes the color brighter
	//for best result the amount should be between aprox 20 and 80 (not too bright not too dark)
	protected Color brightness(float amount) {
		
	    float RGB[] = new float[3];
	    this.color.getColorComponents(RGB);

	    float result[] = new float[3];
	 
	    for(int i = 0 ; i < 3 ; i++) {
	    	//System.out.println();
	    	if(RGB[i] < (float)0.1)
				result[i] = RGB[i] *amount ;
	    	else
	    		result[i] = RGB[i];
	    }

	    return new Color (result[0], result[1], result[2]);
	}


}
