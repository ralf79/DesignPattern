package org.kosta;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Command> comLists = new ArrayList<>();
		
		CommandOne co = new CommandOne();
		
		co.execute();
	}
}
