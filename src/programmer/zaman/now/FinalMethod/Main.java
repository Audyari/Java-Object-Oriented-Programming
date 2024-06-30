package programmer.zaman.now.FinalMethod;

public class Main {

    public static void main(String[] args) {

        // Membuat objek dari kelas ParentClass
        ParentClass parentObject = new ParentClass();

        // Memanggil metode-metode dari ParentClass
        parentObject.myFinalMethod(); // Output: Ini adalah final method dari ParentClass
        parentObject.regularMethod(); // Output: Ini adalah regular method dari ParentClass

        // Membuat objek dari kelas ChildClass
        ChildClass childObject = new ChildClass();

        // Memanggil metode-metode dari ChildClass
        childObject.myFinalMethod(); // Output: Ini adalah final method dari ParentClass
        childObject.regularMethod(); // Output: Ini adalah overridden method dari ChildClass
    }

}