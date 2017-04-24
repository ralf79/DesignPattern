package org.kosta;

public class StateContext {
	private State currentState;

	public StateContext() {
		currentState = State.getInitState();
	}

	public void processEvent(Action action) {
		State next = currentState.act(action);
		if (next != null) {
			System.out.println(action + "에 의해 State가 " + currentState + "에서" + next + "로 바뀜.");
			currentState = next;
			currentState.onEntry();
			
			if (State.isFinalState(currentState)) {
				System.out.println("오메~ 마지막 State에 도달했네~");
			}
		} else {
			System.out.println(action + "은  State가 " + currentState + "에서는 의미 없는 짓.");
		}
	}
}
