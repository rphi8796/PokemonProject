package pokemon.model;

public class Ditto extends Pokemon implements Normal
{
	private String copiedPokemon = "none";
	
	public Ditto(int number, String name)
	{
		super(number, name);
	}
	
	public void listenToMusic()
	{
		System.out.println("When she... she... doors are... closed");
	}
	
	public String talkAboutMovies()
	{
		String opinion = "ughh I hate blockbuster movies!";
		return opinion;
	}
	
}
