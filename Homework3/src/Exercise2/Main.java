package Exercise2;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Email();
        Message m2 = new SMS();
        System.out.println(m1.getType());
        System.out.println(m2.getType());
        //m1.send();
    }
}
