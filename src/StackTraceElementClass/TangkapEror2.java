package StackTraceElementClass;

public class TangkapEror2 {

    public static void main(String[] args) {

        try {
            SampleEror();
        }catch (RuntimeException cekErorLagi){
            cekErorLagi.printStackTrace();
        }
    }

    public static void SampleEror() {

        try {
            String[] testArray = {"Budi", "ASEP", "NUR"};
            System.out.println(testArray[1000]);
        } catch (Throwable tangkaperor) {
            throw new RuntimeException(tangkaperor);
        }
    }
}
