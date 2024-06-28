class Person {

    //Atribut
    String name;
    String address;
    final String country = "Indonesia";

    //metode atau Function
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //metode atau Function
    Person(String paramName){
        this(paramName, null);
    }

    //metode atau Function
    Person(){
        this(null);
    }

    //metode atau Function
    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}