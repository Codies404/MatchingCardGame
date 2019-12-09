import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user=e.getActionCommand();
		System.out.print(user);
		
	}
	

}
