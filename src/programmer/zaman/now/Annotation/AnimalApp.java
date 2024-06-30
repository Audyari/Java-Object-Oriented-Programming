package programmer.zaman.now.Annotation;

@Fancy(name = "AnimalApp", tags = {"application", "java"})

public class AnimalApp {
    public static void main(String[] args) {


        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();

    }
}