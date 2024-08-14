package Interface_Inheritance;

public class Avanza implements Car, isMaintenance {



    @Override
    public void drive() {
        System.out.println("TEST PRINT AVANZA");
    }

    @Override
    public String getBrand() {
        return "Avanza";
    }


    @Override
    public Boolean ismaintenance() {
        return true;
    }


}
