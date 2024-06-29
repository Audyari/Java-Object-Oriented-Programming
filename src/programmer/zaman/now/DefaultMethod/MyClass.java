package programmer.zaman.now.DefaultMethod;

public class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {

        System.out.println("This is the implementation of the abstract method.");
    }

    // Tidak perlu mengimplementasikan defaultMethod(), karena sudah ada implementasi default di antarmuka
}
