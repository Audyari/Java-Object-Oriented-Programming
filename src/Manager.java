class Manager {

    String company;
    String name;
    Manager(String name) {
        this.name = name;
        System.out.println("hallo "+ this.name);
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
        System.out.println("Hi " + this.name + ", My Compeny Is " + this.company);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
}
