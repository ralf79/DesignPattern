package org.kosta;

import java.util.Observable;
import java.util.Observer;

public class Spy implements Observer {
    private Employee employee;
    public Spy(Employee employee) {
        this.employee = employee;
    }
    public void update(Observable o, Object arg) {
        if (o instanceof Watcher) {
            System.out.println("고자질쟁이가 "+employee.getDesc() +"이 놀고 있었다고 고자질.");
        }
    }
}
