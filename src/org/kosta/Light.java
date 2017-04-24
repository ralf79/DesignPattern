package org.kosta;

public class Light {
    private int lightness = 0;
    public int getLightness() {
        return lightness;
    }
    public void setLightness(int lightness) {
        System.out.println("밝기를 "+ lightness + "로 변경.");
        this.lightness = lightness;
    }
}
