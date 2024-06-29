package programmer.zaman.now.Interface;

// Kelas yang mengimplementasikan interface
public class Circle implements Drawable {
    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public void draw() {

        System.out.println("Drawing a circle with radius " + radius);
    }
}
