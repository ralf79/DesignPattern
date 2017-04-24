package org.kosta;

public class Vulture extends Unit {
	public Vulture() {
		expertName = "¹úÃÄ";
	}

	@Override
	protected boolean solve(String p) {
		return p.contains("Áú·µ");
	}
}