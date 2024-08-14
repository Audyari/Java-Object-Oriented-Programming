package BuatInterface;

public class carApp {
    public static void main(String[] args) {

       testInterface panggil = (testInterface) new Avanza();

       panggil.drive();

        System.out.println(panggil.getTire());


    }
}
