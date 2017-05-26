package org.kosta;

public class VisitorA implements Visitor {
	private int number;

	public VisitorA() {
		this.number = 0;
	}


	@Override
	public void visit(Acceptor acceptor) {
		if(acceptor instanceof VisitableA){
			number+=((VisitableA) acceptor).numberOfMember;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}