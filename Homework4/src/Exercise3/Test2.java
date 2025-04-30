package Exercise3;

public class Test2 {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(false, 0);
        lamp1.turnOn();
        lamp1.setBrightness(88);
        System.out.println(lamp1.getBrightness());
        lamp1.dimToHalf();
        System.out.println(lamp1.getBrightness());

    }
}
