import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double numberOfPounds = scanner.nextDouble();

        double kilograms = numberOfPounds * 0.45359237;

        System.out.printf("%f pounds is equal to %f kilograms.", numberOfPounds, kilograms);

        scanner.close();
    }
}
