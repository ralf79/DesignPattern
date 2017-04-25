package org.kosta;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
   
	private static Map<String, Person> map = new HashMap<>();
	
	public static Person getPerson(String name) {
		if (!map.containsKey(name)) {
			Person p = new Person(name);
			map.put(name, p);
		}
		
		return map.get(name);
		
	}
	
} 
