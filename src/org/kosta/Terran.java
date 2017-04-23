package org.kosta;

public class Terran implements Unit {
	private String name;

	public Terran(String name) {
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println(name + " 공격");
	}

	@Override
	public void move() {
		System.out.println(name + " 이동");
	}

	@Override
	public void add(Unit unit) {
	}

	@Override
	public void remove(Unit unit) {
	}

	@Override
	public Unit get(int i) {
		return this;
	}
}
