package org.kosta;

public class Panel {
	private String color ="REd";

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("색상이 "+color+"로 바뀜");
		this.color = color;
	}
	
	
}
