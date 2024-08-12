
public class Object {

    public static void main(String[] args) {
        

        var testObjek = new Person("Audy","Pondok Gede");

        System.out.println(testObjek);

        testObjek.Nama = "Audyari W";
        testObjek.Alamat = "Pondok Gede";

        System.out.println("Nama Kamu : "+ testObjek.Nama);
        System.out.println("Alamat Kamu : "+ testObjek.Alamat);
        System.out.println("Negara kamu  "+ testObjek.Negara);

        String DataA = testObjek.panggilNama("MAKANAN");

        System.out.println(DataA);

        testObjek.Nama = "Asep Show";
        testObjek.kegiatanKamu("Belajar Komputer");

        
        

       

       
       

        

    }
}