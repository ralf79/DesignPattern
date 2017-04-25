package org.kosta;

public class Wraith extends Unit {

	public Wraith() {
		this.UnitName= "·¹ÀÌ¾²";
		
	}

	@Override
	boolean solve(String enemy) {
		return enemy.contains("¹ÂÅ»");
	}
	
	
	
}