package StackTraceElementClass;

public class TangkapEror1 {

    public static void main(String[] args) {

        try {
            String[] testArray = {"Budi", "ASEP", "NUR"};
            System.out.println(testArray[1000]);
        } catch (Throwable tangkaperor){
//            StackTraceElement[] tracertErr = tangkaperor.getStackTrace();
//            System.out.println(tracertErr[0]);
            tangkaperor.printStackTrace();
        }
    }

}
