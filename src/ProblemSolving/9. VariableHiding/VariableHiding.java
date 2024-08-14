class Parent {
    String name;

    void doIt() {
        System.err.println("Do It In Paremt");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.err.println("Do it From Child");
        System.out.println("Panggil Parent "+ super.name);
    }
}

public class VariableHiding {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "PAKE CHILD";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.name = "ASEP";
        parent.doIt();

        System.out.println(parent.name);

    }
}
