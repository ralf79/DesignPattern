package org.kosta;

public class Main {

	public static void main(String[] args) {
		Panel panel = new Panel();
		CommandStack cs = new CommandStack();
		cs.execute(new PanelChangeCommand(panel, "ÁÖÈ²"));
		cs.execute(new PanelChangeCommand(panel, "³ë¶û"));
		cs.execute(new PanelChangeCommand(panel, "ÃÊ·Ï"));

		System.out.println("--undo --");
		cs.undo();
		cs.undo();
		System.out.println("--redo--");
		cs.redo();
		cs.execute(new PanelChangeCommand(panel, "ÆÄ¶û"));
	}

}
