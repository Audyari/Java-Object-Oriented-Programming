package programmer.zaman.now.TrywithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleClass {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

