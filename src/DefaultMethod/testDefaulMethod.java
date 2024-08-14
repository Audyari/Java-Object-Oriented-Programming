package DefaultMethod;

public class testDefaulMethod implements HasBrand {
    @Override
    public void drive() {
        System.out.println("Print test Default");
    }

    @Override
    public int getTire() {
        return 0;
    }

//    @Override
//    public Boolean isBig() {
//        return true;
//    }

    public static void main(String[] args) {
        testDefaulMethod testDefaul = new testDefaulMethod();

        testDefaul.drive();

        System.out.println(testDefaul.getTire());
        System.out.println(testDefaul.isBig());

    }
}
