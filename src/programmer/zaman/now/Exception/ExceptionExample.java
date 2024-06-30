package programmer.zaman.now.Exception;

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
