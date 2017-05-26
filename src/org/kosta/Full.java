package org.kosta;

public class Full implements State {

	
	@Override
	public State eat() {
		System.out.println("angry 발생");
		return new Angry();
	}

	@Override
	public State digest() {
		System.out.println("hungry 발생");
		return new Hungry();
	}

	

}
