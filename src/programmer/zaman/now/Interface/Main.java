package programmer.zaman.now.Interface;

// Penggunaan
public class Main {
    public static void main(String[] args) {

        Drawable circle = new Circle(5.0);

        circle.draw(); // Output: Drawing a circle with radius 5.0
        circle.printInfo(); // Output: Drawing object.
        System.out.println("PI value: " + Drawable.PI); // Output: PI value: 3.14

    }
}
