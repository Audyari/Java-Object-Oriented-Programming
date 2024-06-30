package programmer.zaman.now.StackTraceElementClass;

public class ExampleClass  {

    public static void main(String[] args) {
        try {
            bagi(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            cetakStackTrace(e);
        }
    }

    public static void bagi(int a, int b) {
        int hasil = a / b;
        System.out.println("Hasil: " + hasil);
    }

    private static void cetakStackTrace(Exception e) {
        System.out.println("Stack Trace:");
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println("  di " + element.getClassName() + "." + element.getMethodName() + "(" + element.getFileName() + ":" + element.getLineNumber() + ")");
        }
    }
}