package programmer.zaman.now.AbstractClass;

// Kelas turunan (subclass)
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Implementasi metode abstrak
    @Override
    public void makeSound() {

        System.out.println(name + " Gug Gug.");
    }
}
