public class For {
    public static void main(String[] args) {
        for (int counter = 0; counter < 5; counter++) {
            System.out.println("Counter: " + counter);
        }

        // Infinite loop
        // for (;;) {
        // System.out.println("Infinite loop...");
        // }

        for (int i = 0, j = 10; i < j; i++, j--)
            System.out.println("Counter: i = " + i + ", j = " + j);

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
