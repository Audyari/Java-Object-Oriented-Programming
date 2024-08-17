package test_soal;

public class Mobil {

    private String merk;
    private int tahunPembuatan;
    private String warna;
    private int kecepatanMaksimal;
    private boolean mesinHidup;
    private int kecepatanSaat;

    public Mobil(String merk, int tahunPembuatan, String warna, int kecepatanMaksimal) {
        this.merk = merk;
        this.tahunPembuatan = tahunPembuatan;
        this.warna = warna;
        this.kecepatanMaksimal = kecepatanMaksimal;
        this.mesinHidup = false;
        this.kecepatanSaat = 0;
    }

    public void nyalakanMesin() {
        this.mesinHidup = true;
        System.out.println("Mesin mobil " + this.merk + " dinyalakan.");
    }

    public void matikanMesin() {
        this.mesinHidup = false;
        this.kecepatanSaat = 0;
        System.out.println("Mesin mobil " + this.merk + " dimatikan.");
    }

    public void percepat(int kecepatan) {
        if (this.mesinHidup) {
            this.kecepatanSaat += kecepatan;
            if (this.kecepatanSaat > this.kecepatanMaksimal) {
                this.kecepatanSaat = this.kecepatanMaksimal;
            }
            System.out.println("Mobil " + this.merk + " bergerak dengan kecepatan " + this.kecepatanSaat + " km/jam.");
        } else {
            System.out.println("Tidak dapat mempercepat, mesin mobil " + this.merk + " belum dinyalakan.");
        }
    }
}