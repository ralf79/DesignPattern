package org.kosta;

public class Firebat extends Unit {

	public Firebat() {
		this.UnitName = "파이어뱃";
	}

	@Override
	boolean solve(String enemy) {
		return enemy.contains("저글링");
	}
	
	
}