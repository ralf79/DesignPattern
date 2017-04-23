package org.kosta;

import org.kosta.abs.Unit;
import org.kosta.impl.Fire;
import org.kosta.impl.Firebat;
import org.kosta.impl.Gun;
import org.kosta.impl.Laser;
import org.kosta.impl.Marine;

public class Main {

	public static void main(String[] args) {
		Unit marine = new Marine(new Gun());
		Unit firebat = new Firebat(new Fire());
		Unit laserMarine = new Marine(new Laser());
		
		marine.useWeapon();
		firebat.useWeapon();
		laserMarine.useWeapon();
	}

}
