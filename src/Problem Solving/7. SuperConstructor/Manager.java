
class Manager {

    String nama;
    String usia;

    Manager(String name) {
        this.nama = name;
    }

    Manager(String name, String usia) {
        this.nama = name;
        this.usia = usia;
    }

    void sayHello() {
        System.out.println(this.nama);
    }

}

class VicePresiden extends Manager {

    VicePresiden() {
        super(null);
    }

    VicePresiden(String name) {
        super(name);
    }

    VicePresiden(String name, String usia) {
        super(name, usia);

    }

}
