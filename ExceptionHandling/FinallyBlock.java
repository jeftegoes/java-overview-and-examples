import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get("path to non existing file.txt"));
        } catch (IOException e) {
            System.out.println("*** We are in catch block ***");
            System.out.println("We can log stack trace here: " + Arrays.toString(e.getStackTrace()));
            e.getCause();
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // System.exit(0);
            // throw new RuntimeException();
            System.out.println("Finally block will be executed with and without exception.");
        }

        // Correct handling of exceptions.
        try {

        } finally {

        }

        try {

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {

        }

        // ArithmeticException extends Exception and hence is not allowed as exceptions defined in the same inheritance hierarchy are not allowed in the same multi-catch block.
        // try {
        //
        // } catch (Exception e | ArithmeticException e ) {
        //
        // }
    }
}
