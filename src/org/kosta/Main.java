package org.kosta;

public class Main {

	public static void main(String[] args) {

		Composite main = new Composite("Main");
		
		Composite sub1 = new Composite("sub1");
        Composite sub2 = new Composite("sub2");
        Composite sub11 = new Composite("sub11");
        Composite sub12 = new Composite("sub12");
        Composite sub13 = new Composite("sub13");
        Composite sub21 = new Composite("sub21");
        Composite sub22 = new Composite("sub22");
        Leaf leaf14 = new Leaf("leaf14");
        Leaf leaf121 = new Leaf("leaf121");
        
        main.add(sub1);
        main.add(sub2);
        sub1.add(sub11);
        sub1.add(sub12);
        sub1.add(sub13);
        sub2.add(sub21);
        sub2.add(sub22);
        sub1.add(leaf14);
        sub12.add(leaf121);
        
        System.out.println(main.getString());
	}

}
