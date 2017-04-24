package org.kosta;

public class Main {

	public static void main(String[] args) {
		ControlTower tower = new ControlTower();
        Airplane[] airplanes = new Airplane[10];
        for (int i = 0; i < airplanes.length; i++) {
            airplanes[i] = new Airplane(tower, i);
        }
        for (Airplane airplane : airplanes) {
            airplane.start();
        }
	}

}
