package drawing.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;

import drawing.controller.ArtController;

public class DrawAppPanel extends JPanel
{
	private ArtController app;
	private ArtPanel canvas;
	private JPanel colorPanel;
	private JPanel menuPanel;
	private JScrollPane canvasPane;
	private SpringLayout appLayout;
	private JSlider widthSlider;
	private JButton redButton;
	private JButton greenButton;
	private JButton blueButton;
	private JButton whiteButton;
	private JButton blackButton;
	private JButton purpleButton;
	private JButton orangeButton;
	private JButton yellowButton;
	private JButton randomColorButton;
	private JButton saveButton;
	private JButton loadButton;
	private JButton clearButton;
	
	private final int MINIMUM_LINE = 1;
	private final int MAXIMUM_LINE = 25;
	
	
	
	public DrawAppPanel(ArtController app)
	{
			super();
			this.app = app;
			
			greenButton = new JButton("green");
			redButton = new JButton("red");
			blueButton = new JButton("blue");
			whiteButton = new JButton("white");
			blackButton = new JButton("black");
			purpleButton = new JButton("purple");
			orangeButton = new JButton("orange");
			yellowButton = new JButton("yellow");
			randomColorButton = new JButton("RANDOM!");
			
			appLayout = new SpringLayout();
			
			setupMenuPanels();
			setupSlider();
			setupScrollPane();
			setupPanel();
			setupLayout();
			setupListeners();
	}

	private void setupMenuPanels()
	{
		colorPanel.setPreferredSize(new Dimension(50, 700));
		menuPanel.setPreferredSize(new Dimension(50,700));
		
		purpleButton.setForeground(new Color(75,0, 130));
		blueButton.setForeground(Color.BLUE);
		greenButton.setForeground(Color.GREEN);
		redButton.setForeground(Color.RED);
		orangeButton.setForeground(Color.ORANGE);
		blueButton.setForeground(Color.YELLOW);
		
		colorPanel.add(blackButton);
		colorPanel.add(purpleButton);
		colorPanel.add(greenButton);
		colorPanel.add(yellowButton);
		colorPanel.add(orangeButton);
		colorPanel.add(redButton);
		colorPanel.add(whiteButton);
		colorPanel.add(randomColorButton);
		
		menuPanel.add(widthSlider);
		menuPanel.add(loadButton);
		menuPanel.add(saveButton);
		menuPanel.add(clearButton);
		
	}
	
	private void setupSlider()
	{
		Hashtable<Integer, JLabel> scaleLabels = new Hashtable<Integer, JLabel>();
		scaleLabels.put(MINIMUM_LINE, new JLabel("<HTML>Small<BR>Line</HTML>"));
		scaleLabels.put(MAXIMUM_LINE, new JLabel("<HTML>Large<BR>Line</HTML>"));
		widthSlider.setLabelTable(scaleLabels);
		widthSlider.setSnapToTicks(true);
		widthSlider.setMajorTickSpacing(5);
		widthSlider.setMinorTickSpacing(1);
		widthSlider.setPaintTicks(true);
		widthSlider.setPaintLabels(true);
		widthSlider.setValue((MAXIMUM_LINE + MINIMUM_LINE) / 2);
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, colorPanel, 0, SpringLayout.NORTH, canvasPane);
		appLayout.putConstraint(SpringLayout.SOUTH, colorPanel, 0, SpringLayout.SOUTH, canvasPane);
		appLayout.putConstraint(SpringLayout.WEST, colorPanel, 50, SpringLayout.EAST, canvasPane);
		appLayout.putConstraint(SpringLayout.EAST, colorPanel, 0, SpringLayout.WEST, canvasPane);
		
		appLayout.putConstraint(SpringLayout.WEST, menuPanel, 200, SpringLayout.EAST, canvasPane);
		appLayout.putConstraint(SpringLayout.SOUTH, menuPanel, 0, SpringLayout.SOUTH, canvasPane);
		appLayout.putConstraint(SpringLayout.EAST, menuPanel, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, menuPanel, 0, SpringLayout.NORTH, canvasPane);
		
		appLayout.putConstraint(SpringLayout.NORTH, canvasPane, 25, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, canvasPane, -50, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, canvasPane, 50, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		canvas.addMouseListener(new MouseListener()
			{
				public void mouseClicked(MouseEvent e)
				{
					
				}
				
				public void mousePressed(MouseEvent e)
				{
					
				}
				
				public void mouseReleased(MouseEvent e)
				{
					
				}
				
				public void mouseEntered(MouseEvent e)
				{
					
				}
				
				public void mouseExited(MouseEvent e)
				{
					
				}
			});
		
		canvas.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseDragged(MouseEvent e)
			{
				
			}
			
			public void mouseMoved(MouseEvent e)
			{
				
			}
		});
		
	}
}
