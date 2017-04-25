package org.kosta;

public class Vulture extends Unit {

	public Vulture() {
		this.UnitName = "¹úÃÄ";
	}

	@Override
	boolean solve(String enemy) {
		return enemy.contains("Áú·µ");
	}
	
	
	
}