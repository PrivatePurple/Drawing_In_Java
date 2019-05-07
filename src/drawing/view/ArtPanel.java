package drawing.view;

import javax.swing.*;
import drawing.controller.ArtController;

public class ArtPanel extends JPanel
{
	private ArtController app;
	
	public ArtPanel(ArtController app)
	{
		super();
		
		this.app = app;
	}
}
