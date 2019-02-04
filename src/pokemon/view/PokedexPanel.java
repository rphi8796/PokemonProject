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
		this.setBackground(Color.BLACK);
		this.add(text);
		this.add(label);
	}
	
	private void setupLayout()
	{
		
	}
	
	
	private void setupListeners()
	{
		
	}
}
