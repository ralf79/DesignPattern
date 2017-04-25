package org.kosta;

public class Audio {
	private boolean isPlay =false;
	
	public void turnOn() {
		isPlay = true;
		System.out.println("Audio ÄÑÁü");
	}
	
	public void turnoff() {
		isPlay = false;
		System.out.println("Audio ²¨Áü");
	}
	
	public boolean isPlay() {
		
		return isPlay;
		
	}
}
