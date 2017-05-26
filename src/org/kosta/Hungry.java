package org.kosta;

public class Hungry implements State {

	@Override
	public State eat() {
		System.out.println("eat �߻�");
		return new Full();
	}
	@Override
	public State digest() {
		System.out.println("���� �߻�");
		return this;
	}
}
