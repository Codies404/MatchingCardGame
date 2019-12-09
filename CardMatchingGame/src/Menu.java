import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame{
	
	private static final long serialVersionUID = 1L;
	int width , height;
	private JPanel row1 ,row2, row3,row4,row5;
	private JLabel menu;
	private JButton newGame;
	private JButton leaderboard;
	private JButton help;
	private JButton credits;
	private JButton exit;


	public Menu(String title,int width,int height) {
		super(title);
		repaint();
		this.width = width;
		this.height = height;
		setSize(width,height);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		row1 = new JPanel();
		menu = new JLabel("");
		
		row2 = new JPanel();
		newGame = new JButton("NEW GAME");
		newGame.setBorderPainted(false);
		newGame.setBackground(new Color(47,165,255));
		newGame.setForeground(Color.white);
		newGame.addActionListener(e-> {
			new Game(this);
			dispose();
		});
		
		row3 = new JPanel();
		leaderboard = new JButton("LEADERBOARD");
		leaderboard.setBorderPainted(false);
		leaderboard.setBackground(new Color(47,165,255));
		leaderboard.setForeground(Color.white);

		
		row4 = new JPanel();
		help = new JButton("HELP   ");
		help.setBorderPainted(false);
		help.setBackground(new Color(47,165,255));
		help.setForeground(Color.white);
		credits = new JButton("CREDITS");
		credits.setBorderPainted(false);
		credits.setBackground(new Color(47,165,255));
		credits.setForeground(Color.white);
		
		row5 = new JPanel();
		exit = new JButton("EXIT");
		exit.addActionListener(e -> System.exit(0));
		exit.setBorderPainted(false);
		exit.setBackground(new Color(128,46,46));
		exit.setForeground(Color.white);
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5,1));
	
		
		FlowLayout fl = new FlowLayout();
		row1.setLayout(fl);
		row1.add(menu);
		
		row2.setLayout(fl);
		row2.add(newGame);
		
		row3.setLayout(fl);
		row3.add(leaderboard);
		
		row4.setLayout(fl);
		row4.add(help);
		row4.add(credits);
		
		row5.setLayout(fl);
		row5.add(exit);
		
		pane.add(row1);
		pane.add(row2);
		pane.add(row3);
		pane.add(row4);
		pane.add(row5);

		setContentPane(pane);
		
	}
	public void setVisible() {
		setVisible(true);
		repaint();
	}
	@Override
    public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(45,44,47));
        g.fillRoundRect(390, 0 , 300, height, 15, 15);
        
        g.setColor(new Color(47,165,255));
        g.fillRoundRect(480, 148 , 120, 40, 15, 15);
        g.fillRoundRect(470, 263 , 140, 40, 15, 15);
        g.fillRoundRect(433, 377 , 100, 40, 15, 15);
        g.fillRoundRect(535, 377 , 100, 40, 15, 15);
        g.setColor(new Color(128,46,46));
        g.fillOval(500, 470, 80, 80);
        
        
         
        
    }


}
