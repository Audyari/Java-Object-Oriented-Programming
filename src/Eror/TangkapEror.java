package Eror;

public class TangkapEror {
    public static void main(String[] args) {
        KoneksiDatabase(null, null);
    }

    public static void KoneksiDatabase(String nama, String password) {
        if (nama == null | password == null) {
            throw new ErorClass("DATABASE EROR");
        }
    }
}
