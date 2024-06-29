package programmer.zaman.now.AccessModifier;

public class OuterClass {

    public int publicVariable;    // dapat diakses dari mana saja
    protected int protectedVariable; // dapat diakses dari kelas yang sama, package yang sama, dan subkelas
    int defaultVariable;         // dapat diakses dari package yang sama
    private int privateVariable; // hanya dapat diakses dari dalam kelas ini

    public void publicMethod() {
        // dapat mengakses semua variabel
    }

    protected void protectedMethod() {
        // dapat mengakses semua variabel
    }

    void defaultMethod() {
        // dapat mengakses semua variabel
    }

    private void privateMethod() {
        // dapat mengakses semua variabel
    }

    private class PrivateInnerClass {
        // dapat mengakses semua variabel dari OuterClass
    }
}

class AnotherClass {
    void someMethod() {
        OuterClass oc = new OuterClass();
        oc.publicVariable = 1;     // dapat diakses
        oc.protectedVariable = 2;  // dapat diakses
        oc.defaultVariable = 3;    // dapat diakses
        // oc.privateVariable = 4; // error, tidak dapat diakses
    }
}