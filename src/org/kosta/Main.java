package org.kosta;

public class Main {

	public static void main(String[] args) {
		Machine m = new Machine();
        m.setState(1, 2);
        System.out.println(m.toString());
        int token = m.createMemento();
       
        m.setState(30, 40); // 중간에 상태가 바뀌어도
        System.out.println(m.toString());
        m.restoreState(token); // 기억된 토큰으로 복구 시킬 수 있다.
        System.out.println(m.toString());


	}

}
