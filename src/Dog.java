class Dog extends Animal {
    String breed;


    Dog(String name, int age, String breed) {
        super(name, age); // Memanggil konstruktor Animal(String name, int age)]\

        this.breed = breed;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}