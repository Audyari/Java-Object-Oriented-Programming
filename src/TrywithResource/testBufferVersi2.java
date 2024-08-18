package TrywithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class testBufferVersi2 {

    public static void main(String[] args) {

        try (BufferedReader pangilReader = new BufferedReader(new FileReader("README.md"))) {
            String tulisan;
            while ((tulisan = pangilReader.readLine()) != null) {
                System.out.println(tulisan);
            }
        } catch (IOException dapatEror) {
            System.out.println("EROR MEMBACA FILE " + dapatEror.getMessage());
        }
    }
}