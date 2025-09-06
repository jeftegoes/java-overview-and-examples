import java.util.Arrays;

public class PrimitiveAndRefferenceTypesComparison {
    public static void main(String[] args) {
        int int1 = 128;
        int int2 = 128;

        System.out.printf("1: int1 == int2: %b%n", int1 == int2);
        System.out.printf("2: 1 == 2: %b%n", 1 == 2);
        System.out.printf("3: 65 == 'A': %b%n", 65 == 'A');

        Integer i = 128;
        Integer i2 = 128;
        System.out.printf("4: i == i2: %b%n", i == i2);

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.printf("5: i3 == i4: %b%n", i3 == i4); // Java has an Integer cache (Aka Integer oool) for values in
                                                          // the range -128 to 127.

        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        System.out.printf("6: i5 == i6: %b%n", i5 == i6);

        Integer i7 = Integer.valueOf(127);
        Integer i8 = Integer.valueOf(127);
        System.out.printf("7: i5 == i6: %b%n", i7 == i8);

        System.out.printf("8: i.equals(i2): %b%n", i.equals(i2));

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        System.out.printf("9: arr1 == arr2: %b%n", arr1 == arr2);
        System.out.printf("10: arr1.equals(arr2): %b%n", arr1.equals(arr2));
        System.out.printf("11: Arrays.equals(arr1, arr2): %b%n", Arrays.equals(arr1, arr2));
    }
}
