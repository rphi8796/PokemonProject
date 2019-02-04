package pokemon.model;

public class Ditto extends Pokemon implements Normal
{
	public Ditto(int number, String name)
	{
		super(number, name);
	}
	
	public void listenToMusic()
	{
		
	}
	
	public String talkAboutMovies()
	{
		String opinion = "ughh I hate blockbuster movies!";
		return opinion;
	}
	
}
