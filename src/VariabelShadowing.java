public class VariabelShadowing {
    private int x = 10; // Variabel instance

    public void myMethod(int x) { // Parameter metode memiliki nama yang sama dengan variabel instance
        int y = 20; // Variabel lokal
        System.out.println("Nilai x di dalam metode: " + x); // Akan mengakses parameter x, bukan variabel instance x
        System.out.println("Nilai y di dalam metode: " + y);
        System.out.println("Nilai x di luar metode: " + this.x); // Harus menggunakan this.x untuk mengakses variabel instance

    }
}
