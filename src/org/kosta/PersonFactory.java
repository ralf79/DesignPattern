package org.kosta;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
    private static Map<String, Person> map = new HashMap<String, Person>();
    public static Person getPerson(String name){
        if (!map.containsKey(name)) {
            Person tmp = new Person(name);
            map.put(name, tmp);
        }
        return map.get(name);
    }
   
} 
