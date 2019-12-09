import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Handler implements ActionListener {
	static ArrayList<Player> players = new ArrayList<>();

	@Override
	public void actionPerformed(ActionEvent e) {
		int counter = 0;
		String user = e.getActionCommand();
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).name.equals(user)) {
				counter++;
			}
		}
		if (counter == 0) {
			Player p1 = new Player(0, user);
			addList(p1);
		}
	}

	
	
	static void displayLeaderBoard() {
		for (int i = 0; i < players.size(); i++) {
			System.out.print(players.get(i).name + " ");
			System.out.println(players.get(i).score);
		}
	}

	
	
	
	static void addList(Player p1) {

		for (int i = 0; i < players.size(); i++) {
			if (p1.score > players.get(i).score) {
				players.add(i, p1);
				break;
			}
		}

	}

}
