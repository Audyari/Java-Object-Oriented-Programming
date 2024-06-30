package programmer.zaman.now.StaticKeyword;

public class Example {

    public static void main(String[] args) {

        Counter c1 = new Counter();

        // Menangkap nilai count dari objek c1
        int countFromC1 = c1.getCount();
        System.out.println("Nilai count dari c1: " + countFromC1);

        Counter c2 = new Counter();
        Counter c3 = new Counter();



        System.out.println("Jumlah objek Counter: " + Counter.getCount());


        System.out.println("################################################");

        double area = Math.calculateCircleArea(5.0);
        System.out.println("Luas lingkaran: " + area);
    }
}
