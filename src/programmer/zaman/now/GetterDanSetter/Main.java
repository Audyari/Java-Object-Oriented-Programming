package programmer.zaman.now.GetterDanSetter;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Set name and age using setters
        person.setName("Audyari W");
        person.setAge(30);

        // Get name and age using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Try to set a negative age
        Boolean UmurNegatip = person.setAge(-10); // Output: Age cannot be negative.

        Boolean Umur = person.setAge(10);
        System.out.println(Umur);
        System.out.println(UmurNegatip);


    }
}
