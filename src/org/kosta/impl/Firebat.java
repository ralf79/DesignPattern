package org.kosta.impl;

import org.kosta.abs.Unit;
import org.kosta.abs.Weapon;

public class Firebat extends Unit{
	
	Weapon weapon;

	
	public Firebat(Weapon weapon) {
		this.weapon = weapon;
	}


	@Override
	public void useWeapon() {
		weapon.attack();
	}
	
	

}
