package org.kosta.abs;

public class Marine extends Unit{

	Gun weapon = new Gun();
	
	
	@Override
	public void useWeapon() {
		weapon.attack();
	}
	
	

}
