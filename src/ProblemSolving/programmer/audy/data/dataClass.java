package ProblemSolving.programmer.audy.data;

public class dataClass {

    public String name;
    public int price;

    public dataClass(String name, int price) {
        this.name = name;
        this.price = price;

    }

    static void main(String[] args) {

        dataClass testAccess = new dataClass("Audy", 20000);

        System.out.println(testAccess.name);
        System.err.println(testAccess.price);

    }
}
