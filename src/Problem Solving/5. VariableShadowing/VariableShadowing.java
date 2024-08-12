public class VariableShadowing {
    public static void main(String[] args) {
        
        var testObjek = new siswa(null, null);

        System.out.println(testObjek);

        testObjek.nama= "Guru";

        testObjek.panggilSiswa("AUDY");


    }
}
