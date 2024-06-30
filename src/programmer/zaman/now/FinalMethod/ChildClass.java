package programmer.zaman.now.FinalMethod;

public class ChildClass extends ParentClass {

    // Overriding regular method diperbolehkan
    @Override
    public void regularMethod() {
        System.out.println("Ini adalah overridden method dari ChildClass");
    }

    // Overriding final method akan menyebabkan error kompilasi
    // @Override
    // public void myFinalMethod() {
    //     System.out.println("Ini adalah overridden final method dari ChildClass");
    // }
}
