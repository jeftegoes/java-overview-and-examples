public class Operators {
    public static void main(String[] args) {
        int resultManualIncrement = 1;
        resultManualIncrement = resultManualIncrement + 1;
        System.out.printf("1: %d", resultManualIncrement).println();
        
        int resultIncremented = 1;
        resultIncremented += 4;
        System.out.printf("2: %d", resultIncremented).println();

        int resultIncremented2 = 1;
        resultIncremented2++;
        System.out.printf("3: %d", resultIncremented2).println();

        int resultManualDecrement = 1;
        resultManualDecrement = resultManualDecrement - 1;
        System.out.printf("1: %d", resultManualDecrement).println();
        
        int resultDecrement = 6;
        resultDecrement -= 2;
        System.out.printf("2: %d", resultDecrement).println();

        int resultDecremented2 = 1;
        resultDecremented2--;
        System.out.printf("3: %d", resultDecremented2).println();
    }
}
