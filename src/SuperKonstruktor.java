public class SuperKonstruktor {
    public static void main(String[] args) {

       //Akses Class Animal
        var Animal1 = new Animal("Anjing",17);
        System.out.println(Animal1.name);
        System.out.println(Animal1.age);

        //Akses Class Dog

        var Animal2 = new Dog("AGUS",19,"MAKAN");
        Animal2.display();



    }




}
