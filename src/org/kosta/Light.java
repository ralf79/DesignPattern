package org.kosta;

public class Light {
    private int lightness = 0;
    
    public int getLightness() {
		return lightness;
	}
    
    public void setLight(int light) {
		this.lightness = light;
		System.out.println("¹à±â º¯°æ "+this.lightness);
	}
}
