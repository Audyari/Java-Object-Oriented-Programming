public class PersonApp {
    public static void main(String[] args) {


        // Cara Pemanggilan Constructor
        var person1 = new Person("Audyari W", "Pondok Gede");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // Melakukkan Pemanggilan Methode

        person1.sayHello("Audyari W");

        // Melakukan Pemanggilan Constructor
        Person person2 = new Person("Budi");

        Person person3;
        person3 = new Person();
        person3.name = "Audy";
        person3.sayHello("Asep");

    }
}