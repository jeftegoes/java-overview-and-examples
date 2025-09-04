public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // Unary Arithmetic Operators
        // +
        // -
        // ++
        // --

        int resultManualIncrement = 1;
        resultManualIncrement = resultManualIncrement + 1;
        System.out.printf("1: %d%n", resultManualIncrement);

        int resultIncremented = 1;
        resultIncremented += 4;
        System.out.printf("2: %d%n", resultIncremented);

        int resultIncremented2 = 1;
        resultIncremented2++;
        System.out.printf("3: %d%n", resultIncremented2);

        int resultManualDecrement = 1;
        resultManualDecrement = resultManualDecrement - 1;
        System.out.printf("4: %d%n", resultManualDecrement);

        int resultDecrement = 6;
        resultDecrement -= 2;
        System.out.printf("5: %d%n", resultDecrement);

        int resultDecremented2 = 1;
        resultDecremented2--;
        System.out.printf("6: %d%n", resultDecremented2);

        int resultDecremented3 = 1;
        --resultDecremented3;
        System.out.printf("7: %d%n", resultDecremented3);

        int a = 10;
        int b = a++;
        System.out.printf("8: %d%n", a);
        System.out.printf("8: %d%n", b);

        int x = 20;
        int y = ++x;
        System.out.printf("9: %d%n", x);
        System.out.printf("9: %d%n", y);

        // Relational Operators
        // ==
        // !=
        // >
        // <
        // >=
        // <=
        int result10 = 10;
        int result20 = 20;
        System.out.printf("10: %b%n", result10 == result20);
        System.out.printf("11: %b%n", result10 != result20);
        System.out.printf("12: %b%n", result10 > result20);
        System.out.printf("13: %b%n", result10 < result20);
        System.out.printf("14: %b%n", result10 >= result20);
        System.out.printf("15: %b%n", result10 <= result20);

        // Logical Operators
        // &
        // &&
        // |
        // ||
        // !
        // ^
        
    }
}
