

public class TestingVariabelShadowing {

    public static void main(String[] args) {
        VariabelShadowing obj = new VariabelShadowing();

        // Test ketika tidak ada shadowing
        obj.myMethod(100);

        System.out.println("################################");

        // Test ketika terjadi shadowing
        int x = 50;
        obj.myMethod(x);

    }

}
