package org.kosta;

public abstract class Unit {
	
	private Unit next;
	public String UnitName;
	abstract boolean solve(String enemy);
	
	public void support(String enemy) {
		if(solve(enemy)){
			System.out.println(UnitName+"栏肺 "+enemy+"甫 贸府窃");
		}else{
			if (next!=null) {
				next.support(enemy);
			}else{
				System.out.println("贸府给窃 ");
			}
		}
	}

	public Unit getNext() {
		return next;
	}

	public Unit setNext(Unit next) {
		this.next = next;
		return next;
	}

	public String getUnitName() {
		return UnitName;
	}

	public void setUnitName(String unitName) {
		UnitName = unitName;
	}
	
	

	
}