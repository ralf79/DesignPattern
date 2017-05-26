package org.kosta;

public class Hungry implements State {

	@Override
	public State eat() {
		System.out.println("eat 발생");
		return new Full();
	}
	@Override
	public State digest() {
		System.out.println("동일 발생");
		return this;
	}
}
