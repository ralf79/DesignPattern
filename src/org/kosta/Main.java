package org.kosta;

public class Main {

	public static void main(String[] args) {
		Unit leaf1 = new Terran("Marin");
		  Unit leaf2 = new Terran("Firebet");
		  Unit leaf3 = new Terran("SiegeTank");
		  
		  Platoon composite = new Platoon("1¼Ò´ë");
		  composite.add(leaf2);
		  composite.add(leaf1);
		  
		  composite.add(leaf3);
		  
		 // composite.attack();
		  composite.move();
		  


	}

}
