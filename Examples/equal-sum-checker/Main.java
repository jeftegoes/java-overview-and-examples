public class Main {
    public static boolean hasEqualSum(int firstNum, int secondNum, int equalSumNum) {
        if ((firstNum + secondNum) != equalSumNum) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
}
