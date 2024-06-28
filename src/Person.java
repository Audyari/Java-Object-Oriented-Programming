class Person {

    //-- Artibut atau fields atau Properties

    String name;
    String address;
    final String country = "Indonesia";

    //Constructor
    Person(String name, String address){
        this.name = name;  // memanggil Constructor dengan this
        this.address = address;
    }

    //Constructor overloading
    Person(String paramName){

        this(paramName, null);
    }

    //Constructor overloading
    Person(){

        this(null);
    }

    //metode atau Function sayHello

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}