package Exercise3;

public class Calculator {
    //Variante 1 in Methode geprüft
   /* public static double divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error in divide method: " + e.getMessage());
            return Double.NaN; // Indicating an invalid operation
        }
    }

    public static void main(String[] args) {
        System.out.println(Calculator.divide(3, 0)); // Error handled inside the method
    } */


    //Variante 2 User muss prüfen
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Calculator.divide(3, 0));
        } catch (ArithmeticException e) {
            System.err.println("Error in main method: " + e.getMessage());
        }
    }


    //Use Variant 2 (delegate exceptions to the caller) in backend systems where flexibility and error logging are crucial.
    //✅ Use Variant 1 (handle exceptions inside the method) for user-facing applications where instant feedback matters.
}
