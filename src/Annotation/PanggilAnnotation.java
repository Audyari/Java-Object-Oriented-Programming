package Annotation;



@testAnnotation(name = "ASEP",tags = {"SATU","DUA"})
public class PanggilAnnotation {

    public static void main(String[] args) {

        PanggilAnnotation obj = new PanggilAnnotation();
        testAnnotation panggil = obj.getClass().getAnnotation(testAnnotation.class);

        System.out.println(panggil.name());
        for (String tag : panggil.tags()) {
            System.out.println(tag);
        }
    }
}
