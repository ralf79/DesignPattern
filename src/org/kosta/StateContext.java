package org.kosta;

public class StateContext {
	State state;

	public StateContext(State state) {
		this.state = state;
	}

	public void eatOnce() {
		this.state = state.eat();
	}
	
	public void eatDige() {
		this.state = state.digest();
	}


}
