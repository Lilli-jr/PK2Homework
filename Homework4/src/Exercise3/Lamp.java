package Exercise3;

public class Lamp implements Switchable, Dimmable{
    boolean on;
    int brightness;
    public Lamp(boolean on, int brightness) {
        this.on = false;
        this.brightness = 0;
    }
    public void turnOn(){
        on = true;
        brightness = MAX_BRIGHTNESS;
    }
    public void turnOff(){
        on = false;
        brightness = 0;
    }
    public boolean isOn(){
        return on;
    }
    public void setBrightness(int level){
        if(on){
            brightness = Math.max(0,Math.min(level, MAX_BRIGHTNESS));
        }
    }
    public int getBrightness(){
        return brightness;
    }
}
