package programmer.zaman.now.InterfaceInheritance;

public class KendaraanApp {
    public static void main(String[] args) {

        Mobil mobilTesla = new Tesla();

        mobilTesla.mulai(); // output: Memulai Tesla...
        mobilTesla.percepat(); // output: Mempercepat Tesla...
        mobilTesla.rem();

        Kendaraan kendaraanTesla = new Tesla();
        kendaraanTesla.mulai(); // output: Memulai Tesla...
        kendaraanTesla.berhenti(); // output: Menghentikan Tesla...



    }
}
