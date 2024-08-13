
class Manager {

    String nama;
    String usia;

    Manager(String name) {
        this.nama = name;
    }

  

    void sayHello() {
        System.out.println(this.nama);
    }

}

class VicePresiden extends Manager {

    VicePresiden() {
        super(null);
    }
}
