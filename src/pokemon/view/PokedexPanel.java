package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	
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
	
	private JComboBox<String> pokedexDropdown;
	
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		changeButton = new JButton("Click to change values");
		
		numberField = new JTextField("number");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 225, SpringLayout.WEST, this);
		nameField = new JTextField("name");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 44, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 303, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -452, SpringLayout.EAST, this);
		evolveField = new JTextField("evolve");
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 49, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, -524, SpringLayout.EAST, this);
		attackField = new JTextField("Attack");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 4, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -523, SpringLayout.EAST, this);
		enhancementField = new JTextField("enhance");
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 221, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, -516, SpringLayout.EAST, this);
		healthField = new JTextField("health");
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 53, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -539, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 34, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 210, SpringLayout.WEST, this);
		
		numberLabel = new JLabel("This is the number");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 40, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 64, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -121, SpringLayout.WEST, nameField);
		nameLevel = new JLabel("This is the name");
		appLayout.putConstraint(SpringLayout.NORTH, nameLevel, 69, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -11, SpringLayout.NORTH, nameLevel);
		appLayout.putConstraint(SpringLayout.WEST, nameLevel, 78, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLevel, -618, SpringLayout.EAST, this);
		evolveLabel = new JLabel("This pokemon can evolve");
		appLayout.putConstraint(SpringLayout.SOUTH, evolveLabel, -488, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLevel, -11, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 22, SpringLayout.WEST, this);
		attackLabel = new JLabel("This pokemon's attack is");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 11, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 24, SpringLayout.WEST, this);
		enhanceLabel = new JLabel("This pokemon can enhance");
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 11, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 10, SpringLayout.WEST, this);
		healthLabel = new JLabel("This is the health");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 11, SpringLayout.SOUTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 73, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -28, SpringLayout.WEST, healthField);
		nameLabel = new JLabel("My name is");
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -129, SpringLayout.SOUTH, this);
		imageLabel = new JLabel("Pokemon goes here");
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 373, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 297, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -129, SpringLayout.NORTH, changeButton);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -315, SpringLayout.EAST, this);
		
		pokedexDropdown = new JComboBox<String>();
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, -1, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, changeButton, -87, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -45, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -313, SpringLayout.EAST, this);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupDropdown();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.LIGHT_GRAY);
		
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
		
		this.add(pokedexDropdown);
	}
	
	private void setupLayout()
	{
		
	}
	
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				System.out.print("hey");
			}
		});
		
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
}
