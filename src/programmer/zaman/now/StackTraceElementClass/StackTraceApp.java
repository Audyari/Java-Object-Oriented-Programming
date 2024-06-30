package programmer.zaman.now.StackTraceElementClass;

public class StackTraceApp {

    public static void main(String[] args) {

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Eko", "Kurniawan", "Khannedy"
            };

            System.out.println(names[10]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}