



public class panggilGeter {
    public static void main(String[] args) {
     
        GetterdanSetter testGetterdanSetter = new GetterdanSetter();

        System.out.println(testGetterdanSetter);
        testGetterdanSetter.setId("Asep");
        System.out.println(testGetterdanSetter.getId());

        testGetterdanSetter.setExpensive(true);
        System.out.println(testGetterdanSetter.getExpensive());
    }
}
