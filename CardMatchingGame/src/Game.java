import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {

	public Game() {
		
		JFrame jf = new JFrame("Shape Master!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("New Game", JLabel.CENTER);
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// jf.setUndecorated(true);
				jf.add(label, BorderLayout.NORTH);
				label.setVisible(true);
				
				
				
				
				JButton Easy=new JButton("Easy 5x5");
				JButton Normal=new JButton("Normal 8x8");
				JButton Hard=new JButton("Hard 10x10");
				Container pane=getContentPane();
				 
				 FlowLayout flo=new FlowLayout();
				
				 pane.setLayout(flo);
				
				 pane.add(Easy);
				 pane.add(Normal);
				 pane.add(Hard);
				
				 jf.add(pane);
		jf.setVisible(true);
	}

}
