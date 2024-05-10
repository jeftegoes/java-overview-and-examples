public class PrimitiveTypes {
    public static void main(String[] args) {
        int myValue = 10000;
        System.out.printf("1: %d", myValue).println();

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.printf("2: %d", myMinIntValue).println();

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.printf("3: %d", myMaxIntValue).println();

        System.out.println("4: Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

        System.out.println("5: Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("6: Busted Min Value = " + (myMinIntValue - 1));

        int myMaxIntValueTest = 2_147_483_647;
        System.out.println("7: Test = " + myMaxIntValueTest);

        System.out.println("8: Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("9: Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");

        long myLongValue = 100L;

        System.out.println("10: A long has a width of " + Long.SIZE);
        System.out.println("11: Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

        long bigLongLiteralValue = 2_147_483_647;
        System.out.printf("12: %d", bigLongLiteralValue).println();

        long bigLongLiteralValue2 = 2_147_483_647_234L;
        System.out.printf("12: %d", bigLongLiteralValue2).println();
    }
}
