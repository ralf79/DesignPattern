package org.kosta;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Command> cmds = new ArrayList<Command>();
		  
		cmds.add(new CommandOne());
		cmds.add(new CommandTwo());
		  
		  //여기서부터는 실행부..
		  for (Command command : cmds) {
		   command.execute(); //이놈은 지가 실행시키는 게 뭔지도 모른다!
		  }
	}
}
