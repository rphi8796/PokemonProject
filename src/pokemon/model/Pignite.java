package pokemon.model;

public class Pignite extends Tepig implements Fighting, Fire
{
	public Pignite(int number, String name)
	{
		super(number, name);
	}
	
	public void punch()
	{
		System.out.println("Sorry, my arms are not as strong");
	}
	
	public void kick()
	{
		System.out.println("I am DEFINITELY a kicker");
	}
	
	public void burn()
	{
		System.out.println("That is a spicy a meatball");
	}
	
	public void torch()
	{
		System.out.println("This is too bright");
	}
	
}
