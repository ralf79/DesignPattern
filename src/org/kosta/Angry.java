package org.kosta;

public class Angry implements State {

	@Override
	public State eat() {
		System.out.println("���� �߻�");
		return this;
	}
	@Override
	public State digest() {
		System.out.println("full �߻�");
		return new Full();
	}
}
