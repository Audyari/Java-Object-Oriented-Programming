package PALINDROME;

public class testPalindrom {

    public static void main(String[] args) {
//        System.out.println(cekPalindrom("A"));
//        System.out.println(cekPalindrom("KODOK"));
//        System.out.println(cekPalindrom("CEKKK"));



//        System.out.println( cekPalindromVersi2("kodok"));
//        System.out.println( cekPalindromVersi2("AA"));
//        System.out.println( cekPalindromVersi2("AUDY"));
//        System.out.println(cekPalindromVersi2("A"));

//        cekPalindromVersi2("kodok");
//        cekPalindromVersi2("A");
//        cekPalindromVersi2("AC");


        System.out.println( PalindromeRekursive("kodok"));
        System.out.println( PalindromeRekursive("AA"));
        System.out.println( PalindromeRekursive("AUDY"));
        System.out.println(PalindromeRekursive("A"));
        System.out.println(PalindromeRekursive("ASEP"));
        System.out.println(PalindromeRekursive("AAAAAA"));
    }

    static boolean cekPalindrom(String Data){
        String temp = "";

        for(var i = Data.length() - 1; i >= 0;i--){
            temp = temp + Data.charAt(i);
        }

        if (temp.equals(Data)){
            return true;
        } else {
            return false;
        }
    }

    static boolean cekPalindromVersi2(String Data){
        for (var i = 0; i < Data.length() / 2; i++){
//          System.out.println(i + " copare "+ (Data.length()-(i)-1));

            int DataAwal = i;
            int DataAkhir = Data.length()-(i)-1;

           // System.out.println(Data.charAt(DataAwal) == Data.charAt(DataAkhir));

            return Data.charAt(DataAwal) == Data.charAt(DataAkhir);
        }
    return true;
    }

    static boolean PalindromePakeAI(String data) {
        for (int i = 0; i < data.length() / 2; i++) {
            if (data.charAt(i) != data.charAt(data.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static boolean PalindromeRekursive(String Data){
        return PakeRekursive(Data,0);
    }

    static boolean PakeRekursive(String Data, int i){
        // 1. rekursif kapan selsai nya:
        // 2. masukkan Logic nya
        // 3. panggil rekursife nya

        // 1. rekursif kapan selesai
        if (i >= Data.length() / 2) {
            return true; // kondisi dasar rekursif
        }

        // 2. masukkan logika
        if (Data.charAt(i) != Data.charAt(Data.length() - 1 - i)) {
            return false; // jika terdapat karakter yang tidak sama
        }

        // 3. panggil rekursif
        return PakeRekursive(Data, i + 1);

//        if(i < Data.length() / 2){ // kapan selai nya
//
//
//            int DataAwal = i;
//            int DataAkhir = Data.length()-(i)-1;
//
//            // System.out.println(Data.charAt(DataAwal) == Data.charAt(DataAkhir));
//
//            return Data.charAt(DataAwal) == Data.charAt(DataAkhir);
//
//            }else {
//                PakeRekursive(Data,i+1); // ini panggil lagi rekursife nya
//            }
//        }else {
//            return true;  /// ini kalo kondisi selesai nya terpenuhi
//        }
//        return true;
    }

}
