package org.kosta;

import java.util.ArrayList;
import java.util.List;

public class CommandStack {
	private int current = -1;
	
	List<ReversibleCommand> comLists = new ArrayList<>();
	
	
	public void excute(ReversibleCommand rc){
		for (int inx = comLists.size()-1; inx > current; inx--) {
			comLists.remove(inx);
		}
		comLists.add(rc);
		redo();
	}
	
	public void redo(){
		comLists.get(++current).redo();
	}
	public void undo() {
		comLists.get(current--).undo();
	}
	
}
