package pokemon.model;

public class Nidorina extends Nidoran implements Poison
{
	public Nidorina(int number, String name)
	{
		super(number, name);
	}
	
	public void poisonSkin()
	{
		System.out.println("hmmm I do poison");
	}
	
	public String poorFoodPreparation()
	{
		String disease = "Salmonella";
		return disease;
	}
}
