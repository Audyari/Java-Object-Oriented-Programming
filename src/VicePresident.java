class VicePresident extends Manager {

    VicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }

    void sayHello(String name, String company){
        this.name = name;
        this.company = company;
        System.out.println("Hi " + name + ", Nama Kantor Saya " + this.company);
    }

}