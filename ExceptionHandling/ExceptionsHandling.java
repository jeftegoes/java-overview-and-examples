import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ExceptionsHandling {
    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get("path to non existing file.txt"));
        } catch (IOException e) {
            System.out.println("*** We are in catch block ***");
            System.out.println("We can log stack trace here: " + Arrays.toString(e.getStackTrace()));
            e.getCause();
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
