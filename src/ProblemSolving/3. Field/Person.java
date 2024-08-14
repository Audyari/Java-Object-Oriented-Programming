class Person{
   
    String Nama;
    String Alamat;
    final String Negara = "Indonesia";

    public Person(String nama, String alamat) {
        Nama = nama;
        Alamat = alamat;
    }

    String panggilNama(String inputNama){
        return inputNama;
    }

    void kegiatanKamu(String kegitanKamu){
        System.out.println("Hai Nama "+ Nama +" Kamu Sedang "+ kegitanKamu);
    }



}