
public class Player {

	protected String name;
	protected int score;

	public Player(int score, String name)

	{
		this.name = name;
		this.score = score;

	}
	
	@Override
	public String toString() {
		return "name: "+name +"     "+"score: "+score;
		
	}

}