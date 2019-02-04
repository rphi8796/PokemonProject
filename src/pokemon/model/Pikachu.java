package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	private String nuancedOpinionAboutCapitalPunishment = 
			"Punitive executions have historically been imposed by diverse kinds of authorities,/n"
			+ " for an expansive range of conduct,/n"
			+ " for political or religious beliefs and practices,/n"
			+ " for a status beyond one’s control,/n"
			+ " or without employing any significant due process procedures.  ";
	
	public Pikachu(int number, String name)
	{
		super(number, name);
	}
	
	public void shock()
	{
		System.out.println("Pika");
	}
	
	public String electricChair()
	{
		return nuancedOpinionAboutCapitalPunishment;
	}
}
