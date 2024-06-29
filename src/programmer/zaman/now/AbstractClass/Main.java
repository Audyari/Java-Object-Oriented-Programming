package programmer.zaman.now.AbstractClass;

// Penggunaan
public class Main {
    public static void main(String[] args) {
        // Tidak bisa diinstansiasi secara langsung
        // Animal animal = new Animal("Generic Animal");

        // Membuat instance kelas turunan
        Dog dog = new Dog("ASEPPP");
        dog.makeSound(); // Output: Buddy barks.
        dog.eat(); // Output: Buddy is eating.
    }
}
