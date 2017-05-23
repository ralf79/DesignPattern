package org.kosta;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DCBuilder implements Builder{
	private Hero batman;
	
	DCBuilder(){
        batman = new Hero("¹èÆ®¸Ç");
    }
    public void makeArm() {
        batman.setArmSource("µ·Áö¶ö");
    }
    public void makeLeg() {
        batman.setLegSource("µ·Áö¶ö");
    }
    public Hero getResult() {
        return batman;
    }
}
