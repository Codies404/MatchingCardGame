import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Joker extends JPanel {
	private int width , height;
	
	public Joker(int width , int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(10, 10, width-20, height-20);
		
		//just because you would decrease our grade if we used icons
		
		
		g.setColor(new Color(242,242,242)); // skin 
								//1  2   3    4   5   6   7   8   9  10  11  12  13  14  15  16  17  18
		g.fillPolygon(new int[] {59 ,55 ,55 , 59, 60, 60,78, 90 ,110,120,135,135,139,143,143,132,100,60 },
					  new int[] {100,102,125,127,127,140,160,180,180,160,140,127,127,123,102,70 ,50 ,70 },18);
		
		g.setColor(new Color(230,230,230));//skin shade
		g.fillPolygon(new int[] {100,120,135,135,139,143,143,143,132,100},
					  new int[] {180,160,140,127,127,123,102,102,70 ,50},10);
		
		
		g.setColor(new Color(0,204,0));//hair
								//1  2   3  4  5  6  7   8   9   10  11   12  13 14  15  16  17  18 19 20 21  the point of the polygon for the hair
		g.fillPolygon(new int[] {60, 59, 44,60,70,80,120,116,150,135,150,135,135,128,134,115,100,85,68,74,67}, 
					  new int[] {120,100,60,70,40,53,20, 50, 45, 70, 70, 120,97 ,90, 77 ,64, 80, 64,72,90,97} , 21);
		//making a new hair with only the right parts and making a more darker green to look like a shadow
		g.setColor(new Color(0,175,51));
		g.fillPolygon(new int[] {120,116,150,135,150,135,135,128,134,115,100},
					  new int[] {20, 50, 45, 70, 70, 120,97 ,90, 77 ,64, 80 } , 11);
		
		
		
		g.setColor(new Color(230,0,0));//smile
								//1  2   3   4   5   6   7   8
		g.fillPolygon(new int[] {65 ,90 ,110,132,114,105,95 ,87},
					  new int[] {140,150,150,140,160,176,176,160} , 8);
		
		g.setColor(new Color(255,255,230));
		g.fillPolygon(new int[] {85 ,96,105,114,103,97},
					  new int[] {153,156,156,153,170,170}, 6);
		g.setColor(new Color(230,0,0));
		g.setFont(new Font("TimesRoman", Font.PLAIN, 18)); 
		g.drawString("JOKER",70,116);
		
		
	}

}
