public class ThisKeyword {

    private String name;
    private int age;

    public ThisKeyword(String name) {
        this.name = name;
        this.age = 0;
    }

    public ThisKeyword(String name, int age) {
        this(name); // memanggil konstruktor lain
        this.age = age;
    }

    public void setName(String name) {
        this.name = name; // mengakses variabel instance name
    }

    public void setAge(int age) {
        this.age = age; // mengakses variabel instance age
    }

    public void introduce(Person person) {
        System.out.println("Hello, my name is " + this.name + " and I'm introducing " + person.name); // mengakses variabel instance
    }

    public ThisKeyword becomesFriendWith(ThisKeyword friend) {
        System.out.println(this.name + " and " + friend.name + " are now friends!");
        return this; // mengembalikan objek saat ini
    }

    public static void main(String[] args) {

        // unitTest Pertama
        ThisKeyword alice = new ThisKeyword("Alice");
        ThisKeyword bob = new ThisKeyword("Bob", 30);
        System.out.println(alice.age);

        //unitTest KeDua

        ThisKeyword person = new ThisKeyword("Audy1");
        person.setName("Audy2");
        person.setAge(35);

        System.out.println(person.name);
        System.out.println(person.age);




    }
}
