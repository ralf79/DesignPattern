package org.kosta;

public class Hero {

	private String armSource;
    private String legSource;
    private String name;
    
    public Hero(String name) {
        super();
        this.name = name;
    }
    public void setArmSource(String armSource) {
        this.armSource = armSource;
    }
    public void setLegSource(String legSource) {
        this.legSource = legSource;
    }
    public void showResult(){
        System.out.println(armSource +"로 만든 팔과 " + legSource +"로 만든 다리를 가진 " + name);
    }
}
