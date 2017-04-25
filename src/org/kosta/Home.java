package org.kosta;

public class Home {
    private TV tv;
    private Light light;
    private Audio audio;
    
	public Home() {
		tv = new TV();
		audio = new Audio();
		light = new Light();
		
		this.tv = tv;
		this.light = light;
		this.audio = audio;
	}
    public void enjoyTv(){
    	System.out.println("티비를 본다");
    	tv.turnOn();
    	light.setLight(2);
    }
    
    public void enjoyMusic(){
    	System.out.println("음악을 감상한다");
    	audio.turnOn();
    }

	public void out(){
		System.out.println("외출한다");
		tv.turnoff();
		audio.turnoff();
		light.setLight(0);
	}
    
}
