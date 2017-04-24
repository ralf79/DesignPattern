package org.kosta;

public abstract class Worker {
	protected abstract void doit();

	public final void work() {
		System.out.println("Ãâ±Ù");
		doit();
		System.out.println("Åð±Ù");
	}
}