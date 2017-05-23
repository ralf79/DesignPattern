package org.kosta.abs;

public class Main {

	public static void main(String[] args) {
		Unit marine = new Marine();
		Unit firebat = new Firebat();
		Unit laserM = new Marine2();
		
		laserM.useWeapon();
		
		marine.useWeapon();
		firebat.useWeapon();
	}

}
