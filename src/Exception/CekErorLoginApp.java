package Exception;

import Record_Class.LoginRequest;

public class CekErorLoginApp {

    public static void main(String[] args)  {

        LoginRequest buatObjek = new LoginRequest("ASEP","ASEPP");

        try {
            ClassCekEror.cekEror(buatObjek);
            System.out.println("SUKSES TIDAK ADA EROR");
        }catch (ClassTangkapEror hasilEror){
            System.out.println("TERJADI EROR DENGAN PESAN " + hasilEror);
            System.out.println("TERJADI EROR DENGAN PESAN " + hasilEror.getMessage());
        }

        System.out.println("############################################################");

        LoginRequest buatObjek2 = new LoginRequest("","");

        try {
            ClassCekEror.cekEror(buatObjek2);
        }catch (ClassTangkapEror hasilEror){
            System.out.println("TERJADI EROR DENGAN PESAN " + hasilEror);
            System.out.println("TERJADI EROR DENGAN PESAN " + hasilEror.getMessage());
        }

        System.out.println("############################################################");

        LoginRequest buatObjek3 = new LoginRequest(null,null);

        try {
            ClassCekEror.cekEror(buatObjek3);
        }catch (ClassTangkapEror hasilEror){
            System.out.println("TERJADI EROR DENGAN PESAN " + hasilEror);
            System.out.println("TERJADI EROR DENGAN PESAN " + hasilEror.getMessage());
        }catch (NullPointerException hasilEror){
            System.out.println("TERJADI EROR PAKE NULL POINTER " + hasilEror);
            System.out.println("TERJADI EROR PAKE NULL POINTER " + hasilEror.getMessage());
        }


        System.out.println("############################################################");

        LoginRequest buatObjek4 = new LoginRequest("",null);

        try {
            ClassCekEror.cekEror(buatObjek4);
        }catch (ClassTangkapEror | NullPointerException  hasilEror){
            System.out.println("Gabung kan 2 exeption " + hasilEror);
            System.out.println("Gabung kan 2 exeption " + hasilEror.getMessage());
        }

        System.out.println("############################################################");

        LoginRequest buatObjek5 = new LoginRequest("",null);

        try {
            ClassCekEror.cekEror(buatObjek5);
        }catch (ClassTangkapEror | NullPointerException  hasilEror){
            System.out.println("Gabung kan 2 exeption " + hasilEror);
            System.out.println("Gabung kan 2 exeption " + hasilEror.getMessage());
        }finally {
            System.out.println("MAU EROR KE TETEP DI JALAN KAN");
            System.out.println("BIasanya buat clear memory");
        }
    }
}
