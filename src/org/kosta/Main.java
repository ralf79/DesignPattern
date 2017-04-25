package org.kosta;

public class Main {

	public static void main(String[] args) {

		Person p1 = PersonFactory.getPerson("안철수");
		Person p2 = PersonFactory.getPerson("문재인");
		Person p3 = PersonFactory.getPerson("안철수");
		
		System.out.println(p1==p2?"같다":"틀림");
		System.out.println(p1==p3?"같다":"틀림");
		
	}

}
