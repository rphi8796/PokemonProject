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
	
	private JComboBox pokedexDropdown;
	
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		changeButton = new JButton("Click to change values");
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 67, SpringLayout.WEST, this);
		
		numberField = new JTextField("number");
		appLayout.putConstraint(SpringLayout.WEST, numberField, 12, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, 82, SpringLayout.SOUTH, numberField);
		nameField = new JTextField("name");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 34, SpringLayout.EAST, numberField);
		evolveField = new JTextField("evolve");
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 48, SpringLayout.EAST, nameField);
		attackField = new JTextField("Attack");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 49, SpringLayout.EAST, evolveField);
		enhancementField = new JTextField("enhance");
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 45, SpringLayout.EAST, attackField);
		healthField = new JTextField("health");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 143, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -24, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		
		numberLabel = new JLabel("Number");
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, numberField);
		nameLevel = new JLabel("Name");
		appLayout.putConstraint(SpringLayout.NORTH, nameLevel, 25, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLevel, 0, SpringLayout.WEST, numberField);
		evolveLabel = new JLabel("Evolve");
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 24, SpringLayout.SOUTH, nameLevel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 0, SpringLayout.WEST, numberField);
		attackLabel = new JLabel("Attack");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 29, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, numberField);
		enhanceLabel = new JLabel("Enhance");
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 32, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 0, SpringLayout.WEST, numberField);
		healthLabel = new JLabel("This is the health");
		nameLabel = new JLabel("My name is");
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -295, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 30, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, numberField);
		imageLabel = new JLabel("Pokemon goes here");
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 0, SpringLayout.NORTH, nameLevel);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 230, SpringLayout.EAST, nameLevel);
		
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 1, SpringLayout.NORTH, changeButton);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, enhancementField);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
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
}
