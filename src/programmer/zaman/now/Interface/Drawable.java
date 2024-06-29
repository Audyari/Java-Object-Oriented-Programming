package programmer.zaman.now.Interface;

// Interface
public interface Drawable {

    double PI = 3.14; // Variabel konstanta

    void draw(); // Metode abstrak

    default void printInfo() { // Metode default
        System.out.println("Drawing object.");
    }
}

