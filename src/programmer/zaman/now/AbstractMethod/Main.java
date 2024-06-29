package programmer.zaman.now.AbstractMethod;

// Usage
public class Main {
    public static void main(String[] args) {
        // Cannot instantiate abstract class directly
        // Animal animal = new Animal("Generic Animal");

        Dog dog = new Dog("Buddy");
        dog.makeSound(); // Output: Buddy barks.
        dog.eat(); // Output: Buddy is eating.
    }
}
