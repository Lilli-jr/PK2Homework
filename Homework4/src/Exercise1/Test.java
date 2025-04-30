package Exercise1;

public class Test {
    public static void main(String[] args) {

        Milk milk = new Milk(25, 10, 5);
        System.out.println("Milk bulk discount: " + milk.getBulkDiscount());
        System.out.println("Milk warning: " + milk.showWarning());


        Flour flour = new Flour(10, 8, 3);
        System.out.println("Flour bulk discount: " + flour.getBulkDiscount());
        System.out.println("Flour warning: " + flour.showWarning());




    }
}
