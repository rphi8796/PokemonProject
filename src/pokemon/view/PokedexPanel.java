package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;
import java.awt.*;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	private JTextField text;
	private JLabel label;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		text = new JTextField("text");
		label = new JLabel("label");
		appLayout = new SpringLayout();

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.LIGHT_GRAY);
		this.add(text);
		this.add(label);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, label, 93, SpringLayout.SOUTH, text);
		appLayout.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, text);
		appLayout.putConstraint(SpringLayout.SOUTH, label, 275, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, label, 34, SpringLayout.EAST, text);
		appLayout.putConstraint(SpringLayout.NORTH, text, 87, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, text, 97, SpringLayout.WEST, this);
	}
	
	
	private void setupListeners()
	{
		
	}
}
