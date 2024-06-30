package programmer.zaman.now.StaticKeyword;

public class OuterClass {

    private int x = 10;

    public int getX() {
        return this.x;
    }

    public static class NestedClass {
        public void printX(OuterClass outerClass) {
            System.out.println("Nilai x dari kelas luar: " + outerClass.getX());
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.NestedClass nc = new OuterClass.NestedClass();
        nc.printX(outer);
    }
}