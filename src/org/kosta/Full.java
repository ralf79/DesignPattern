package org.kosta;

public class Full implements State {

	
	@Override
	public State eat() {
		System.out.println("angry �߻�");
		return new Angry();
	}

	@Override
	public State digest() {
		System.out.println("hungry �߻�");
		return new Hungry();
	}

	

}
