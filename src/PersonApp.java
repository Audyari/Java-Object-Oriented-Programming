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

        //Cara Pemanggilan Constructor overloading
        Person Pemanggilan1 = new Person("Audy", "Pondok Gede"  );
        Person Pemanggilan2 = new Person("Audy" );
        Person Pemanggilan3 = new Person();

        System.out.println(Pemanggilan1);
        System.out.println(Pemanggilan1.name);
        System.out.println(Pemanggilan1.address);
        System.out.println(Pemanggilan1.country);

        System.out.println(Pemanggilan2);
        System.out.println(Pemanggilan2.name);
        System.out.println(Pemanggilan2.address);
        System.out.println(Pemanggilan2.country);

        System.out.println(Pemanggilan3);
        System.out.println(Pemanggilan3.name);
        System.out.println(Pemanggilan3.address);
        System.out.println(Pemanggilan3.country);



    }
}