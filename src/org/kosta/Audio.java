package org.kosta;

public class Audio {
	private boolean playing = false;

	public void play() {
		playing = true;
		System.out.println("¿Ωæ«¿ª ø¨¡÷.");
	}

	public void stop() {
		playing = false;
		System.out.println("¿Ωæ«¿ª ∏ÿ√„");
	}

	public boolean isPlaying() {
		return playing;
	}
}
