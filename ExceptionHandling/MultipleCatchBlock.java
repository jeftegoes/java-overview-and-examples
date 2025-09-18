import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get("path to non existing file.txt"));
            Connection conn = DriverManager.getConnection("");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        try {
            Files.readAllLines(Paths.get("path to non existing file.txt"));
            Connection conn = DriverManager.getConnection("");
        } catch (IOException e) {
            System.out.println("Notify user that file is missing.");
        } catch (SQLException e) {
            System.out.println("Notify user that database is down.");
        }

        try {
            Files.readAllLines(Paths.get("path to non existing file.txt"));
            var fileReader = new FileReader("filename.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found error.");
        } catch (IOException e) {
            System.out.println("Notify user that file is missing.");
        }
    }
}
