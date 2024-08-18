package TrywithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class testingBuffer {

    public static void main(String[] args) {

        BufferedReader pangilReader = null;

        try {
            pangilReader = new BufferedReader(new FileReader("README.md"));
            while (true) {
                String tulisan = pangilReader.readLine();
                if (tulisan == null) {
                    break;

                } else {
                    System.out.println(tulisan);
                }
            }
        } catch (Throwable dapatEror) {
            System.out.println("EROR MEMBACA FILE " + dapatEror.getMessage());
        } finally {
            if (pangilReader != null) {
                try {
                    pangilReader.close();
                    System.out.println("SUKSES MENUTUP");
                } catch (IOException datapatERR) {
                    System.out.println("EROR PENUTUP DATA" + datapatERR.getMessage());
                }

            }
        }
    }
}
