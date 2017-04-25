package org.kosta;

public class Main {

	public static void main(String[] args) {
		Panel panel = new Panel();
		
		CommandStack cs = new CommandStack();
		
		cs.excute(new PanelChangeCommand(panel, "BLUE"));
		cs.excute(new PanelChangeCommand(panel, "YELLOW"));
		cs.excute(new PanelChangeCommand(panel, "WHITE"));
		
		System.out.println("undo ผ๖วเ");
		cs.undo();
		cs.undo();
		
		System.out.println("REDO");
		
		cs.redo();
		
	}

}
