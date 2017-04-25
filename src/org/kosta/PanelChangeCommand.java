package org.kosta;

public class PanelChangeCommand implements ReversibleCommand {
	public Panel panel;
	public String newColor;
	public String oldColor;
	
	
	
	public PanelChangeCommand(Panel panel, String newColor) {
		this.panel = panel;
		this.oldColor = panel.getColor();
		this.newColor = newColor;
		
	}

	@Override
	public void redo() {
		panel.setColor(newColor);
	}

	@Override
	public void undo() {
		panel.setColor(oldColor);
	}
	
	
}
