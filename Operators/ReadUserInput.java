import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter any word: ");
        String word = scanner.next();
        System.out.println("You entered this word: " + word);
        System.out.println("Please, enter any integer number: ");
        int i = scanner.nextInt();
        System.out.println("You entered this integer number: " + i);
    }
}
