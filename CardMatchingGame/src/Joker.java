import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Joker extends Shapes {
	
	public Joker(int width , int height) {
		super(width,height,0,0);
		shape = 5;
	}
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(8, 10, width-10, height-10);
		
		//just because you would decrease our grade if we used icons
		//we also divided everything with 2 because we are kinna idiots and test it on a 200x200 canvas when our panels were actually 93x93
		
		
		g.setColor(new Color(242,242,242)); // skin 
								//1  2   3    4   5   6   7   8   9  10  11  12  13  14  15  16  17  18
		g.fillPolygon(new int[] {59/2 ,55/2 ,55/2 , 59/2, 60/2, 60/2,78/2, 90/2 ,110/2,120/2,135/2,135/2,139/2,143/2,143/2,132/2,100/2,60/2 },
					  new int[] {100/2,102/2,125/2,127/2,127/2,140/2,160/2,180/2,180/2,160/2,140/2,127/2,127/2,123/2,102/2,70/2 ,50/2 ,70/2 },18);
		
		g.setColor(new Color(230,230,230));//skin shade
		g.fillPolygon(new int[] {100/2,120/2,135/2,135/2,139/2,143/2,143/2,143/2,132/2,100/2},
					  new int[] {180/2,160/2,140/2,127/2,127/2,123/2,102/2,102/2,70/2 ,50/2},10);
		
		
		g.setColor(new Color(0,204,0));//hair
								//1  2   3  4  5  6  7   8   9   10  11   12  13 14  15  16  17  18 19 20 21  the point of the polygon for the hair
		g.fillPolygon(new int[] {60/2, 59/2, 44/2,60/2,70/2,80/2,120/2,116/2,150/2,135/2,150/2,135/2,135/2,128/2,134/2,115/2,100/2,85/2,68/2,74/2,67/2}, 
					  new int[] {120/2,100/2,60/2,70/2,40/2,53/2,20/2, 50/2, 45/2, 70/2, 70/2, 120/2,97/2 ,90/2, 77/2 ,64/2, 80/2, 64/2,72/2,90/2,97/2} , 21);
		//making a new hair with only the right parts and making a more darker green to look like a shadow
		g.setColor(new Color(0,175,51));
		g.fillPolygon(new int[] {120/2,116/2,150/2,135/2,150/2,135/2,135/2,128/2,134/2,115/2,100/2},
					  new int[] {20/2, 50/2, 45/2, 70/2, 70/2, 120/2,97/2 ,90/2, 77/2 ,64/2, 80/2 } , 11);
		
		
		
		g.setColor(new Color(230,0,0));//smile
								//1  2   3   4   5   6   7   8
		g.fillPolygon(new int[] {65/2 ,90/2 ,110/2,132/2,114/2,105/2,95/2 ,87/2},
					  new int[] {140/2,150/2,150/2,140/2,160/2,176/2,176/2,160/2} , 8);
		
		g.setColor(new Color(255,255,230));
		g.fillPolygon(new int[] {85/2 ,96/2,105/2,114/2,103/2,97/2},
					  new int[] {153/2,156/2,156/2,153/2,170/2,170/2}, 6);
		g.setColor(new Color(230,0,0));
		g.setFont(new Font("TimesRoman", Font.PLAIN, 9)); 
		g.drawString("JOKER",70/2,116/2);
		
		
	}

}
