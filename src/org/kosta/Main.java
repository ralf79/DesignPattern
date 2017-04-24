package org.kosta;

public class Main {

	public static void main(String[] args) {
		Watcher watcher = new Watcher();
        Employee pc1 = new Employee("만화책보는 놈");
        Employee pc2 = new Employee("퍼질러 자는 놈");
        Employee pc3 = new Employee("포카치는 놈");
        //spy는 pc3을 보고 있음.
        //요놈은 꼰질르기의 대가
        Spy spy = new Spy(pc3);
        
        watcher.addObserver(pc1);
        watcher.addObserver(pc2);
        watcher.addObserver(pc3);
        watcher.addObserver(spy);
        
        watcher.action("사장 뜸.");
        watcher.deleteObserver(pc3);
        watcher.deleteObserver(spy);
        
        watcher.action("사장 뜸.");
	}

}
