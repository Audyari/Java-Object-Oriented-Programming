package programmer.zaman.now.RuntimeException;

public class IllegalArgumentExampleClass {

    public static void main(String[] args) {
        try {
            processNumber(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void processNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }if (number > 0) {
            throw new IllegalArgumentException("Number Positippp");
        }
        // code to process the number
        System.out.println("Processing number: " + number);
    }
}
