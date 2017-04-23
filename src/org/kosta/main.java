package org.kosta;

public class Main {

	public static void main(String[] args) {
		SocketAdapterImpl sai = new SocketAdapterImpl();
		
		System.out.println(sai.get120Volt().getVolts());
		System.out.println(sai.get12Volt().getVolts());
	}

}
