package org.kosta;

public class Turtle {

	private Aquarium aquarium;

	public void getAquarium() {
		System.out.println(aquarium.getMyName()+"Get Turtle");
	}

	public void insertAquarium() {
		System.out.println(aquarium.getMyName()+"insertAquarium Turtle");
	}

	public Turtle(Aquarium aquarium) {
		this.aquarium = aquarium;
	}
	
	
}
