package org.kosta;

public class Main {

	public static void main(String[] args) {
		String[] problems = {"Áú·µ","Àú±Û¸µ","¹ÂÅ»","¾÷±Û Àú±Û¸µ","ÅÊÅ©" };
        
        Firebat fb = new Firebat();
        Vulture vt = new Vulture();
        Wraith wr = new Wraith();
        
       fb.setNext(wr).setNext(vt);
       
       for (String pp : problems) {
		fb.support(pp);
       }
        		

	}

}
