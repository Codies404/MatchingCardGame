import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class Handler implements ActionListener {
	static ArrayList<Player> players = new ArrayList<>();

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = e.getActionCommand();
		JOptionPane.showMessageDialog(null, user);
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).name.equals(user)) {
				return;
			}
		}
		Player p1 = new Player(0, user);
		addList(p1);
		
	}

	
	
	static void displayLeaderBoard() {
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < players.size() ; i++) {
			str.append(players.get(i) + "\n");
		}
		JOptionPane.showMessageDialog(null, str.toString());

	}

	
	
	
	static void addList(Player p1) {
		if(players.size() == 0 ) {
			players.add(p1);
			return;
		}
		for (int i = 0; i < players.size(); i++) {
			if (p1.score >= players.get(i).score) {
				players.add(i, p1);
				break;
			}
		}

	}

}
