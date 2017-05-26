package org.kosta;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Acceptor> ac = new ArrayList<>();

		ac.add(new VisitableA(1));
		ac.add(new VisitableA(2));
		ac.add(new VisitableA(3));
		ac.add(new VisitableA(4));
		ac.add(new VisitableA(5));

		VisitorA visitor = new VisitorA();
		for (Acceptor va : ac) {
			va.accept(visitor);
		}

		System.out.println(visitor.getNumber());
	}

}
