package drawing.view;

import javax.swing.JFrame;
import drawing.controller.ArtController;

public class DrawFrame extends JFrame
{
	private ArtController app;
	
	public DrawFrame(ArtController app)
	{
		super();
		this.app = app;
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1000, 800);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	
}
