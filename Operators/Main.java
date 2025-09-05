public class Main {
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

        // Relational (Comparison) Operators
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
        // System.out.println(false & (5 / 0 == 0)); // Exception
        System.out.printf("16: %b%n", false && (5 / 0 == 0));
        // System.out.println(true | (5 / 0 == 0)); // Exception
        System.out.printf("17: %b%n", true || (5 / 0 == 0));
        System.out.printf("18: %b%n", !true);
        System.out.printf("19: %b%n", true ^ true);
        System.out.printf("20: %b%n", true ^ false);
        System.out.printf("21: %b%n", false ^ true);

        // Bitwise Operators
        // &
        // |
        // ^
        // ~
        // >>
        // >>>
        // <<
        System.out.printf("22: 4 & 5 = %d%n", 4 & 5);
        // 1 0 0
        // & & &
        // 1 0 1
        // -----
        // 1 0 0 = 4
        System.out.printf("23: 4 | 5 = %d%n", 4 | 5);
        // 1 0 0
        // & & &
        // 1 0 1
        // -----
        // 1 0 1 = 5
        System.out.printf("23: 4 | 5 = %d%n", 4 ^ 5);
        // 1 0 0
        // ^ ^ ^
        // 1 0 1
        // -----
        // 0 0 1 = 1
        System.out.printf("24: ~1 = %d%n", ~1);
        System.out.printf("25: %s%n", Integer.toBinaryString(1));
        System.out.printf("26: %s%n", Integer.toBinaryString(-2));
        System.out.printf("27: %s%n", (byte) 0b11111110);
        System.out.printf("28: %s%n", (byte) 0b10000000);
        System.out.printf("29: %s%n", (byte) 0b11000000);

        System.out.println("30: 5 = " + 0b101);
        System.out.println("31: 5 >> 1 = " + (0b101 >> 1));
        System.out.println("32: 5 in binary format = " + Integer.toBinaryString(5));
        System.out.println("33: 2 in binary format = " + Integer.toBinaryString(2));

        System.out.println("34: 5 = " + 0b101);
        System.out.println("35: 5 >>> 1 = " + (0b101 >>> 1));

        int negativeByteValue = 0b11111111111111111111111110000000;
        System.out.println("36: -128 = " + negativeByteValue);
        System.out.println("37: -128 >>> 1 = " + (negativeByteValue >>> 1));
        System.out.println("38: -128 >> 1 = " + (negativeByteValue >> 1));

        System.out.println("39: 5 = " + 0b101);
        System.out.println("40: 5 << 1 = " + (0b101 << 1));
        System.out.println("41: 5 in binary format = " + Integer.toBinaryString(5));
        System.out.println("42: 10 in binary format = " + Integer.toBinaryString(10));

        System.out.println("43: 10 * 2 = 10 << 1 = " + (10 << 1));
        System.out.println("44: 10 / 2 = 10 >> 1 = " + (10 >> 1));

        // Ternary Operator
        // (condition) ? true expression : false expression
        System.out.println(2 > 1 ? "2 is greater than one" : "2 is not less than one.");
        System.out.println(2 < 1 ? "2 is greater than one" : "2 is not less than one.");

    }
}
