public class TypeCheckingAndCasting {
    public static void main(String[] args) {

        // Contoh type checking dan casting
        Object obj = new String("Hello");

        // Type checking menggunakan instanceof
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("Casting successful!");
            System.out.println("The string is: " + str.toUpperCase());
        } else {
            System.out.println("Object is not a String");
        }

        System.out.println("##############################################");

        // Contoh casting antara tipe data primitif
        int i = 10;
        double d = (double) i;
        System.out.println("Integer value: " + i);
        System.out.println("Double value: " + d);

        // Contoh casting yang akan menghasilkan ClassCastException
        obj = new Integer(20);
        try {
            String s = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred: " + e.getMessage());
        }
    }
}