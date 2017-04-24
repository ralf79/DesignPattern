package org.kosta;

public class Home {
    private Audio audio;
    private Light light;
    private TV tv;
    public Home(Audio audio, Light light, TV tv) {
        this.audio = audio;
        this.light = light;
        this.tv = tv;
    }
    public void enjoyTv(){
        System.out.println("==∫“¿ª π‡∞‘«œ∞Ì TV∫∏±‚.");
        light.setLightness(2);
        tv.turnOn();
    }
    public void enjoyMusic(){
        System.out.println("==∫“¿ª æ‡∞£ æÓµ”∞‘«œ∞Ì ¿Ωæ«µË±‚.");
        light.setLightness(1);
        audio.play();
    }
    public void goOut(){
        System.out.println("==TV≤Ù∞Ì, ¿Ωæ«µµ ≤Ù∞Ì, ∫“µµ ≤Ù∞Ì ø‹√‚«œ±‚.");
        if (tv.isTurnedOn()) {
            tv.turnOff();
        }
        if (audio.isPlaying()) {
            audio.stop();
        }
        light.setLightness(0);
    }
}
