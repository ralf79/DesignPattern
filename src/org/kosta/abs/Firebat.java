package org.kosta.abs;

public class Firebat extends Unit{
	
	Fire weapon = new Fire();

	

	@Override
	public void useWeapon() {
		weapon.attack();
	}
	
	

}
