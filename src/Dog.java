// Subclass (Child Class)
class Dog extends Animal {
    private String breed;

    public void panggilNama() {
        System.out.println(this.name);
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}