package pokemon.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
//import pokemon.view.PokedexFrame;
import pokemon.model.*;
import pokemon.view.PokedexFrame;


public class PokedexController
{
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokedexFrame(this);
	}
	
	
	public void start()
	{
		addPokemon();
	}
	
	
	private void addPokemon()
	{
		pokemonList.add(new Ditto(132, "Guy"));
		pokemonList.add(new Nidoran(32, "Jeff"));
		pokemonList.add(new Nidorina(30, "Jeffette"));
		pokemonList.add(new Pignite(499, "Pigo"));
		pokemonList.add(new Pikachu(25, "Pikaka"));
	}
	
	public boolean isInt(String maybeInt)
	{
		boolean isValid = false;
		
		try 
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		
		return isValid;
		
	}
	
	public boolean isDouble(String mightBeDouble)

	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;	
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number witha . in the middle?");
		}
		
		return isValid;
	}

	public PokedexFrame getFrame()
	{
		return appFrame;
	}

	public ArrayList<Pokemon> getPokemonList()
	{
		return pokemonList;
	}
	
	

}
