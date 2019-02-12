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
		numberField.setEnabled(false);
		nameField = new JTextField("name");
		evolveField = new JTextField("evolve");
		attackField = new JTextField("attack");
		enhancementField = new JTextField("enhance");
		healthField = new JTextField("health");
		
		numberLabel = new JLabel("This is the number");
		nameLevel = new JLabel("This is the name");
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel("This pokemon's attack is");
		enhanceLabel = new JLabel("This pokemon can enhance");
		healthLabel = new JLabel("This is the health");
		nameLabel = new JLabel("My name is");
		imageLabel = new JLabel("Pokemon goes here");	
		pokedexDropdown = new JComboBox<String>();

		
		
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
		appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 6, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -618, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 28, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 64, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 40, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLevel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 28, SpringLayout.EAST, nameLevel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLevel, 73, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLevel, -618, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -17, SpringLayout.NORTH, nameLevel);
		appLayout.putConstraint(SpringLayout.WEST, nameLevel, 78, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 0, SpringLayout.WEST, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 28, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLevel, -17, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 22, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 28, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 139, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, evolveLabel, -17, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 24, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, -5, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 28, SpringLayout.EAST, enhanceLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 17, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, enhanceLabel, 33, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 28, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 17, SpringLayout.SOUTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -379, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 73, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -618, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, 107, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 68, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 74, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -70, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -39, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 1, SpringLayout.NORTH, changeButton);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 48, SpringLayout.EAST, changeButton);
	}
	
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				System.out.println("yes");
			}
		});
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
}
