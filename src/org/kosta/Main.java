package org.kosta;

public class Main {

	public static void main(String[] args) {
		StateContext context = new StateContext(new Hungry());
		context.eatOnce();
		context.eatOnce();
		context.eatOnce();
		context.eatDige();
		context.eatDige();
		context.eatDige();
	}
}




