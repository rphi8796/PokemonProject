package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JButton saveButton;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLevel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	private JLabel nameLabel;
	
	private ImageIcon pokemonIcon;
	
	private JComboBox<String> pokedexDropdown;
	
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		
		
		appLayout = new SpringLayout();
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/ditto.png"));
		changeButton = new JButton("Click to change values");
		saveButton = new JButton("Save");
		
		numberField = new JTextField("132");
		numberField.setEnabled(false);
		nameField = new JTextField("name");
		evolveField = new JTextField("false");
		
		attackField = new JTextField("0");

		enhancementField = new JTextField("0.0");
		healthField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, 40, SpringLayout.SOUTH, healthField);
		
		
		numberLabel = new JLabel("This is the number");
		appLayout.putConstraint(SpringLayout.WEST, numberField, 28, SpringLayout.EAST, numberLabel);
		
		nameLevel = new JLabel("This is the name");
		
		evolveLabel = new JLabel("This pokemon can evolve");
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 26, SpringLayout.EAST, evolveLabel);
		
		attackLabel = new JLabel("This pokemon's attack is");

		enhanceLabel = new JLabel("This pokemon can enhance");
		healthLabel = new JLabel("This is the health");
		appLayout.putConstraint(SpringLayout.WEST, healthField, 28, SpringLayout.EAST, healthLabel);
		
		nameLabel = new JLabel("My name is");

		imageLabel = new JLabel("Pokemon goes here", pokemonIcon, JLabel.CENTER);

		
		pokedexDropdown = new JComboBox<String>();
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, 0, SpringLayout.SOUTH, imageLabel);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -98, SpringLayout.WEST, imageLabel);
		

		
		setupPanel();
		setupLayout();
		setupListeners();
		setupDropdown();
		sendDataToController();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 400));
		this.setBackground(new Color(0, 102, 204));
		
		this.add(changeButton);
		
		this.add(numberField);
		this.add(nameField);
		this.add(evolveField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(healthField);
		
		this.add(numberLabel);
		this.add(nameLevel);
		this.add(evolveLabel);
		this.add(attackLabel);
		this.add(enhanceLabel);
		this.add(healthLabel);
		this.add(nameLabel);
		this.add(imageLabel);
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(pokedexDropdown);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, healthField, -66, SpringLayout.WEST, imageLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, -66, SpringLayout.WEST, imageLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -66, SpringLayout.WEST, imageLabel);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 374, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -52, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -26, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, changeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -40, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 5, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.NORTH, nameLevel, 73, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 7, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 133, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, evolveField, -6, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLevel, -50, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 29, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 1, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 63, SpringLayout.WEST, enhanceLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -618, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 64, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 40, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLevel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 28, SpringLayout.EAST, nameLevel);
		appLayout.putConstraint(SpringLayout.EAST, nameLevel, -618, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -17, SpringLayout.NORTH, nameLevel);
		appLayout.putConstraint(SpringLayout.WEST, nameLevel, 78, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 28, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 139, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 24, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, -5, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 28, SpringLayout.EAST, enhanceLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 17, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, enhanceLabel, 33, SpringLayout.SOUTH, attackLabel);
	}
	
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				sendDataToController();
			}
		});
		
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				String[] nums = appController.buildPokedexNums();
				String[] attacks = appController.buildPokedexAttacks();
				String[] names = appController.buildPokedexNames();
				String[] health = appController.buildPokedexHealth();
				String[] evolve = appController.buildPokedexEvolve();
				String number = nums[pokedexDropdown.getSelectedIndex()];
				String attack = attacks[pokedexDropdown.getSelectedIndex()];
				String nicName = names[pokedexDropdown.getSelectedIndex()];
				String healthPoints = health[pokedexDropdown.getSelectedIndex()];
				String canEvolve = evolve[pokedexDropdown.getSelectedIndex()];
				
				changeImageDisplay(name);
				nameField.setText(nicName);
				numberField.setText(number);
				attackField.setText(attack);
				healthField.setText(healthPoints);
				evolveField.setText(canEvolve);
			}
		});
		
		saveButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				changeImageDisplay(name);
			}
		});
			
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
		pokedexDropdown.setModel(temp);
	
	}
	
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(appController.isInt(attackField.getText()) && appController.isDouble(enhancementField.getText()) && appController.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			data[0] = attackField.getText();
			data[1] = enhancementField.getText();
			data[2] = healthField.getText();
			data[3] = nameField.getText();
			data[4] = evolveField.getText();
			appController.updatePokemon(index, data);
		}
		
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "pikachu";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
	
	
	
	
	
	
	
	
	
	
}
