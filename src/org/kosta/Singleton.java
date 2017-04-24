package org.kosta;

public class Singleton {
    
	private static Singleton singleton = new Singleton();
    
    private Singleton(){
        System.out.println("인스턴스가 만들어졌다.");
    }
    public static Singleton getInstance(){
    	if(singleton == null){
    		singleton = new Singleton();
    	}
    	
    	return singleton;
		
    }
}

