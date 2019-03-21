package pokemon.controller;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pokemon.model.*;
import pokemon.view.PokedexFrame;


public class PokedexController
{
	private String saveFile = "backup.pokemon";
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
		loadPokedex();
	}
	
	public void addPokemon()
	{
		pokemonList.add(new Ditto());
		pokemonList.add(new Nidoran());
		pokemonList.add(new Nidorina());
		pokemonList.add(new Pignite());
		pokemonList.add(new Pikachu());
		pokemonList.add(new Aye());
	}
	
	public void updatePokemon(int index, String [] data)
	{
		if (data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	
	public String[] buildPokedexText()
	{
		String [] names = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}
	
	public String[] buildPokedexNames()
	{
		String [] numbers = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			numbers[index] = "" + pokemonList.get(index).getName();
		}
		return numbers;
	}
	
	public String[] buildPokedexNums()
	{
		String [] numbers = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			numbers[index] = "" + pokemonList.get(index).getNumber();
		}
		return numbers;
	}
	
	public String[] buildPokedexAttacks()
	{
		String [] numbers = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			numbers[index] = "" + pokemonList.get(index).getAttackPoints();
		}
		return numbers;
	}
	
	public String[] buildPokedexHealth()
	{
		String [] numbers = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			numbers[index] = "" + pokemonList.get(index).getHealthPoints();
		}
		return numbers;
	}
	
	public String[] buildPokedexEnhance()
	{
		String [] numbers = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			numbers[index] = "" + pokemonList.get(index).getEnhancementModifier();
		}
		return numbers;
	}
	
	public String[] buildPokedexEvolve()
	{
		String [] numbers = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			numbers[index] = "" + pokemonList.get(index).getEvolvability();
		}
		return numbers;
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
	
	public void savePokedex()
	{
		try
		{
			FileOutputStream saveStream = new FileOutputStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(pokemonList);
			output.close();
			saveStream.close();
			
		}
		catch(IOException error)
		{
			JOptionPane.showMessageDialog(appFrame, error.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void loadPokedex()
	{
		try
		{
			ArrayList<Pokemon> saved = new ArrayList<Pokemon>();
			FileInputStream inputStream = new FileInputStream(saveFile);
			ObjectInputStream input = new ObjectInputStream(inputStream);
			saved = (ArrayList<Pokemon>) input.readObject();
			input.close();
			inputStream.close();
			pokemonList = saved;
		}
		catch(IOException error)
		{
			JOptionPane.showMessageDialog(appFrame, "No Save file", "Loading Pokemon", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(ClassNotFoundException pokemonError)
		{
			JOptionPane.showMessageDialog(appFrame, pokemonError.getMessage(), "Type Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
