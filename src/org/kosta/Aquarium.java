package org.kosta;

public class Aquarium {
	private String myName;
	
	public Aquarium(String myName) {
		this.myName = myName;
	}

	public void setWash() {
		System.out.println("Aquarium wash");
	}

	public String getMyName() {
		return myName;
	}
	

}
