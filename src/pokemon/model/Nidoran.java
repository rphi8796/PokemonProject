package pokemon.model;

public class Nidoran extends Pokemon implements Poison
{
	
	public Nidoran(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void poisonSkin()
	{
		System.out.println("You have been poisoned");
	}
	
	public String poorFoodPreparation()
	{
		String disease = "Ecoli";
		return disease;
	}
}
