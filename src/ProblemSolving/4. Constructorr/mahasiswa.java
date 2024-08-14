
class mahasiswa {
    String Nama;
    String Alamat;
    int Usia;

    public mahasiswa(String nama, String alamat, int usia) {
        Nama = nama;
        Alamat = alamat;
        Usia = usia;
    }

    mahasiswa(String nama) {
       this(nama, null, 0);
    }


    void panggilNama(String NamaKamu) {
        System.out.println(NamaKamu);
    }
}
