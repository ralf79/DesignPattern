package org.kosta;

public class Main {
    public static void main(String[] args) {
    	Builder builder = new DCBuilder();
        Director director = new Director(builder);
        director.build();
        Hero hero = director.getHero();
        hero.showResult();
    }
}
