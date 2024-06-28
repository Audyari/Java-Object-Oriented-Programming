public class PersonApp {
    public static void main(String[] args) {

        // Maniputasi Artibut atau fields atau Properties

        var person1 = new Person();
        person1.name = "Audyari W";
        person1.address = "Pondok Gede";
        var negara = person1.country;

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(negara);

//        var person1 = new Person("Eko", "Subang");
//
//        System.out.println(person1.name);
//        System.out.println(person1.address);
//        System.out.println(person1.country);
//
//        person1.sayHello("Budi");
//
//        Person person2 = new Person("Budi");
//
//        Person person3;
//        person3 = new Person();
//        person3.name = "Joko";
//        person3.sayHello("Budi");

    }
}