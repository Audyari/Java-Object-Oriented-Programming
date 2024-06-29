package programmer.zaman.now.DefaultMethod;

public interface MyInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("This is the default method implementation.");
    }
}

