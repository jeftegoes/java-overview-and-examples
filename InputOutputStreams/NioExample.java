import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("testDirectoryNio", "innerTestDirectoryNio");

        System.out.println("Files.isDirectory(path): " + Files.isDirectory(path));
        System.out.println("Files.isRegularFile(path): " + Files.isRegularFile(path));
        Files.createDirectories(path);

        Path filePath = Paths.get("testDirectoryNio", "result.csv");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        Files.delete(path);
    }
}
