package test_soal;

public class mobilAll {

    public static void main(String[] args) {

        Mobil mobilA = new Mobil("Toyota Corolla", 2020, "Putih", 180);
       // Mobil mobilB = new Mobil("Honda Civic", 2018, "Hitam", 200);

        mobilA.nyalakanMesin();
        mobilA.percepat(50);
        mobilA.percepat(60);
        mobilA.matikanMesin();

//        mobilB.nyalakanMesin();
//        mobilB.percepat(80);
//        mobilB.percepat(90);
//        mobilB.matikanMesin();


    }




}
