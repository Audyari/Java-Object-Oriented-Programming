package programmer.zaman.now.AbstractMethod;

// Concrete Subclass
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Implementation of Abstract Method
    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}
