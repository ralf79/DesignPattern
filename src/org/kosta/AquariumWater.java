package org.kosta;

public class AquariumWater {

	private Aquarium aquarium;

	public AquariumWater(Aquarium aquarium) {
		this.aquarium = aquarium;
	}

	public void getAquarium() {
		System.out.println(aquarium.getMyName()+"Set Water");
	}

	public void setAquarium() {
		System.out.println(aquarium.getMyName()+"Set Water");
	}

	
	
}
