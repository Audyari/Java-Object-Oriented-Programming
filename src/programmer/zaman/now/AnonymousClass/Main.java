package programmer.zaman.now.AnonymousClass;

public class Main {

    public static void main(String[] args) {

        // Membuat objek anonymous class yang mengimplementasikan antarmuka MyInterface

        MyInterface myObject = new MyInterface() {

            @Override
            public void myMethod() {
                System.out.println("Ini adalah implementasi myMethod() dari anonymous class.");
            }
        };

        // Memanggil metode dari objek anonymous class
        myObject.myMethod();
    }

    interface MyInterface {
        void myMethod();
    }
}
