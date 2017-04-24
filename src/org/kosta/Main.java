package org.kosta;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Units units = new Units();
		units.add("히드라");
		units.add("마린");
		units.add("질럿");

		Iterator<String> iterator = units.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
