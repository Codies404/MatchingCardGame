import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Card extends JPanel implements MouseListener {
	private Shapes faceUp;
	private CardBack faceDown;
	private int chooseFace ;
	
	public Card(int shape , int width , int height , int color,int orientation) {
		super();
		setPreferredSize(new Dimension(100,100));
		if(shape == 1) {
			faceUp = new Triangle(width,height,color,orientation);
		}else if(shape == 2) {
			faceUp = new Rect(width,height,color,orientation);
		}else if (shape == 3 ) {
			faceUp = new Diamond(width,height,color,orientation);
		}else if (shape == 4) {
			faceUp = new Circle(width,height,color);
		}else if (shape == 5) {
			//the color is basically the shape of the joker since the color will always be black
			faceUp = new Joker(width,height,color);
		}
		faceDown = new CardBack(width,height);
		

	}

	@Override 
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		if(chooseFace%2 == 0 ) {
			g.fillRect(0, 0, 93, 93);
			faceDown.paintBack(g);
		}

		else {
			g.fillRect(0, 0, 93, 93);
			faceUp.render(g);
		}
		
		if(chooseFace == 0) {
			repaint();
			chooseFace=2;
		}

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		chooseFace++;
		System.out.println(chooseFace);
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

	
}
