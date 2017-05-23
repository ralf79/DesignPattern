package org.kosta.abs;

public class Marine2 extends Unit{

	Laser weapon = new Laser();
	
	
	@Override
	public void useWeapon() {
		weapon.attack();
	}
	
	

}
