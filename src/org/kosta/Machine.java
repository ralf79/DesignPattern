package org.kosta;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    private int state1;
    private int state2;

    private List<Memento> backup = new ArrayList<>();

    public int createMemento() {
            Memento m = new Memento();
            m.state1 = this.state1;
            m.state2 = this.state2;
            backup.add(m);

            return backup.size() - 1; // 특정 토큰을 반환한다.
    }
   
    void restoreState(int token) {
            Memento m = backup.get(token); // 저장된 토큰으로 복구한다.
            this.state1 = m.state1;
            this.state2 = m.state2;
    }
    
    void setState(int a, int b) {
            this.state1 = a;
            this.state2 = b;
    }

    @Override
    public String toString() {
            return "Machine [state1=" + state1 + ", state2=" + state2 + ", backup="+ backup + "]";
    }
   
}

