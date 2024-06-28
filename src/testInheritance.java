public class testInheritance {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "ASEP"; // Inherited from Animal class
        myDog.setBreed("DAGING");
        myDog.eat(); // Inherited from Animal class
        myDog.sleep(); // Inherited from Animal class
        myDog.bark(); // Specific to Dog class
        myDog.panggilNama();
        System.out.println(myDog.getBreed());

    }

}
