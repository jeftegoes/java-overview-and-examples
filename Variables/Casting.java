public class Casting {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myTotal = (myMinIntValue / 2);

        System.out.printf("1: %d", myTotal).println();

        // byte myNewByteValue = (myMinByteValue / 2); ERROR: incompatible types: possible lossy conversion from int to byte.
        byte myMinByteValue = Byte.MIN_VALUE;

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.printf("2: %d", myNewByteValue).println();

        short myMinShortValue = Short.MIN_VALUE;

        short myNewShortValue = (short)(myMinShortValue / 2);
        System.out.printf("3: %d", myNewShortValue).println();
    }
}
