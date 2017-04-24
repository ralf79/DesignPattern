package org.kosta;

public class TV {
	private boolean turnedOn = false;

	public void turnOn() {
		turnedOn = true;
		System.out.println("TV¸¦ ÄÔ.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("TV¸¦ ²û.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
