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
        System.out.printf("13: %d", bigLongLiteralValue2).println();

        System.out.println("14: Float Value Range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        System.out.println("15: Double Value Range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;
        System.out.printf("16: %d", myIntValue).println();
        System.out.printf("17: %f", myFloatValue).println();
        System.out.printf("18: %f", myDoubleValue).println();

        float myOtherFloatValue = 5.25f;
        float myOtherFloatValue2 = (float) 5.25;
        System.out.printf("19: %f", myOtherFloatValue).println();

        myIntValue = 5 / 2;
        System.out.printf("20: %d", myIntValue).println();

        myFloatValue = 5f / 2f;
        System.out.printf("21: %f", myFloatValue).println();

        myDoubleValue = 5d / 2d;
        System.out.printf("22: %f", myDoubleValue).println();

        myIntValue = 5 / 3;
        System.out.printf("23: %d", myIntValue).println();

        myFloatValue = 5f / 3f;
        System.out.printf("24: %f", myFloatValue).println();

        myDoubleValue = 5.00 / 3.00;
        System.out.printf("25: %f", myDoubleValue).println();

        char myChar = 'D';
        System.out.printf("26: %s", myChar).println();

        char myUnicode = '\u0044';
        System.out.printf("27: %s", myUnicode).println();

        char myDecimalCode = 68;
        System.out.printf("28: %s", myDecimalCode).println();

        boolean myTrueBooleanValue = true;
        System.out.printf("29: %s", myTrueBooleanValue).println();

        boolean myFalseBooleanValue = false;
        System.out.printf("30: %s", myFalseBooleanValue).println();

        String myString = "This is a string";
        System.out.println("31: My string is equal to " + myString);
        System.out.println("32: " + myString + ", and this is more.");
        myString = "I wish I had \u00241,000,000.00";
        System.out.println("33: " + myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("34: " + lastString);
    }
}
