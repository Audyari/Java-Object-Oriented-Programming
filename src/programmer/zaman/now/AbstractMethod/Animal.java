package programmer.zaman.now.AbstractMethod;


// Abstract Class
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract Method
    public abstract void makeSound();

    // Concrete Method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

