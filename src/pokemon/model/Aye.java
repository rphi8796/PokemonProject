package pokemon.model;
import javax.swing.JOptionPane;


public class Aye extends Pokemon implements Fire
{
	public Aye()
	{
		super(9999, "aye");
	}
	
	public Aye(String name)
	{
		super(9999, name);
	}
	
	public Aye(int num, String name)
	{
		super(num, name);
	}
	
	public void juicewrld()
	{
		JOptionPane.showMessageDialog(null, "I still see your shadows in my room");
	}
	
	public void torch()
	{
		JOptionPane.showMessageDialog(null, "bruhhh");
	}
	
	public void burn()
	{
		JOptionPane.showMessageDialog(null, "yo yo yo");
	}
}
