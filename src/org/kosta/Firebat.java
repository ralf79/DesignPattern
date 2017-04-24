package org.kosta;

public class Firebat extends Unit {
	public Firebat() {
		this.expertName = "파이어뱃";
	}

	@Override
	protected boolean solve(String p) {
		return p.contains("저글링");
	}
}