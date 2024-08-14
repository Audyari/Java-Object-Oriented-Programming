class siswa {

    String nama;
    String alamat;
   
    public siswa(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    void panggilSiswa(String namaSiswa){
        System.out.println("Halo" + namaSiswa +"Saya "+ this.nama);
    }
    
}
