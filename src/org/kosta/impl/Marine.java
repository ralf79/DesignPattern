package org.kosta.impl;

import org.kosta.abs.Unit;
import org.kosta.abs.Weapon;

public class Marine extends Unit{

	Weapon weapon;
	
	public Marine(Weapon weapon) {
		this.weapon = weapon;
	}



	@Override
	public void useWeapon() {
		weapon.attack();
	}
	
	

}
