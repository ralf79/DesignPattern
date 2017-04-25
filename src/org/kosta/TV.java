package org.kosta;

public class TV {
	private boolean isTurnOn = false;
	
	public void turnOn() {
		isTurnOn = true;
		System.out.println("ÄÑÁü");
	}
	
	public void turnoff() {
		isTurnOn = false;
		System.out.println("²¨Áü");
	}
	
	public boolean isTurnOn() {
		
		return isTurnOn;
		
	}
	
}
