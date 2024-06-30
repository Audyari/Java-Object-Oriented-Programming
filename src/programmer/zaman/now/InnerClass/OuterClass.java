package programmer.zaman.now.InnerClass;

public class OuterClass {

    private int outerVariable = 10;

    public void outerMethod() {

        System.out.println("Ini adalah metode dari OuterClass.");

        // Inner class dapat mengakses anggota dari OuterClass
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    private class InnerClass {

        public void innerMethod() {
            System.out.println("Ini adalah metode dari InnerClass.");
            System.out.println("Nilai outerVariable: " + outerVariable);
        }
    }
}

