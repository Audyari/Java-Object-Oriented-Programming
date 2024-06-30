package programmer.zaman.now.FinalClass;

public final class MathUtil {

    private MathUtil() {
        // Private constructor to prevent instantiation
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        double sum = MathUtil.add(a, b);
        System.out.println("Hasil penjumlahan: " + sum);

        double difference = MathUtil.subtract(a, b);
        System.out.println("Hasil pengurangan: " + difference);

        double product = MathUtil.multiply(a, b);
        System.out.println("Hasil perkalian: " + product);

        double quotient = MathUtil.divide(a, b);
        System.out.println("Hasil pembagian: " + quotient);

        // Mencoba untuk mewariskan kelas MathUtil akan menyebabkan error kompilasi
        // class MyMathUtil extends MathUtil { } // Error: Cannot extend final class 'MathUtil'
    }
}
