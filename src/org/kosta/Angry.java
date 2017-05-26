package org.kosta;

public class Angry implements State {

	@Override
	public State eat() {
		System.out.println("동일 발생");
		return this;
	}
	@Override
	public State digest() {
		System.out.println("full 발생");
		return new Full();
	}
}
