public class Example {
    public static void main(String[] args) {
        int myFirstNumber = 5;
        myFirstNumber = 10;

        System.out.printf("1: %d", myFirstNumber).println();

        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.printf("2: %d", myTotal).println();

        myThirdNumber = myFirstNumber * 2;

        System.out.printf("3: %d", myThirdNumber).println();

        int myLastOne = 1000;

        myLastOne -= myTotal;

        System.out.printf("4: %d", myLastOne).println();
    }
}
