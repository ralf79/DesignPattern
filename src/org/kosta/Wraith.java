package org.kosta;

public class Wraith extends Unit {
	public Wraith() {
		this.expertName = "·¹ÀÌ¾²";
	}

	@Override
	protected boolean solve(String p) {
		return p.contains("¹ÂÅ»");
	}
}