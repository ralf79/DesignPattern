package org.kosta;

public abstract class Unit {
	private Unit next;
	protected String expertName;
	protected abstract boolean solve(String p);
	
	public void support(String p) {
		if (solve(p)) {
			System.out.println(expertName + "이(가) " + p + "을(를) 해결해 버렸네.");
		} else {
			if (next != null) {
				next.support(p);
			} else {
				System.out.println(p+ "은(는) 해결할 넘이 없다.");
			}
		}
	}

	public Unit setNext(Unit next) {
		this.next = next;
		return next;
	}

	
}