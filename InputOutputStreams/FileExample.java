import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("testDirectory");
        file.mkdir();

        file = new File("testDirectory2//innerTestDirectory");
        file.mkdirs();

        file = new File("testDirectory3" + File.separator + "innerTestDirectory");
        if (file.mkdirs()) {
            System.out.println("Success!");
        } else {
            System.out.println("Files are exist.");
        }

        System.out.println("File Separator: " + File.separator);
        System.out.println("Path Separator: " + File.pathSeparator);

        String toWrite = "asdasdasd" + System.lineSeparator() + "new line";
        System.out.println(toWrite);

        file = new File("result.csv");
        file.createNewFile();

        System.out.println("file.exists(): " + file.exists());
        System.out.println("file.isDirectory(): " + file.isDirectory());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
        }

        System.out.println("file.getAbsoluteFile(): " + file.getAbsoluteFile());
        System.out.println("file.canExecute(): " + file.canExecute());
        System.out.println("file.isFile(): " + file.isFile());
        System.out.println("file.isHidden(): " + file.isHidden());

        File[] listFiles = file.listFiles(pathname -> pathname.getName().endsWith(".java"));
    }
}
