package programmer.zaman.now.AbstractClass;

// Abstract Class
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Metode abstrak
    public abstract void makeSound();

    // Metode konkret
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

