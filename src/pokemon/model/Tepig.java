package pokemon.model;

public class Tepig extends Pokemon implements Fire
{
	public Tepig(int number, String name)
	{
		super(number, name);
	}
	
	public void burn()
	{
		System.out.println("You need some aloe");
	}
	
	public void torch()
	{
		System.out.println("let there be light");
	}
}
