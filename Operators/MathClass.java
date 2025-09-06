public class MathClass {
    public static void main(String[] args) {
        System.out.printf("1: %f%n", Math.PI);
        System.out.printf("2: %d%n", Math.max(3, 5));
        System.out.printf("3: %d%n", Math.min(3, 5));
        System.out.printf("4: %f%n", Math.sqrt(4));
        System.out.printf("5: %d%n", Math.abs(-5));
        System.out.printf("6: %f%n", Math.sqrt(-1));
        System.out.printf("7: %f%n", 0 / 0.0);
        System.out.printf("8: %f%n", (0 / 0.0) + 5);
        System.out.printf("9: %f%n", 5 / 0.0);
        System.out.printf("10: %f%n", -5 / 0.0);

        System.out.printf("11: %d%n", Math.round(20.0 / 3.0));
        System.out.printf("12: %f%n", Math.round(20.0 * 100.0 / 3.0) / 100.0);
        System.out.printf("13: %f%n", Math.random()); // between 0.0 and 1.0
        System.out.printf("14: %d%n", (int) (Math.random() * 100)); // between 0 and 100
        System.out.printf("15: %d%n", (int) (Math.random() * 100) + 100); // between 100 and 200
    }
}