public class Variables {
    static long l = 10;

    public static void main(String[] args) {
        int myFirstNumber = 5;
        myFirstNumber = 10;

        System.out.printf("1: %d%n", myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.printf("2: %d%n", myTotal);

        myThirdNumber = myFirstNumber * 2;

        System.out.printf("3: %d%n", myThirdNumber);

        int myLastOne = 1000;

        myLastOne -= myTotal;

        System.out.printf("4: %d%n", myLastOne);

        final String s = "OCJP";
        System.out.printf("5: %s%n", s);

        Integer myInteger = 10;
        System.out.printf("6: %d%n", myInteger);
    }
}