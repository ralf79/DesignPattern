package org.kosta;

public class AquariumDeco {
	private Aquarium aquarium;

	public AquariumDeco(Aquarium aquarium) {
		this.aquarium = aquarium;
	}

	public void getAquarium() {
		System.out.println(aquarium.getMyName()+"Get Deco");
	}

	public void setAquarium() {
		System.out.println(aquarium.getMyName()+"Set Deco");
	}
	
	

}
