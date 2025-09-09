public class ForEach {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int sum = 0;
        for (int number : arr) {
            sum += number;
            System.out.println("1: Number - " + number);
        }

        System.out.println("1: Sum: " + sum);

        for (int i = 0; i < 5; i++) {
            System.out.println("*** i = " + i + " ***");
            for (int j = 0; j < 3; j++) {
                System.out.print("2: " + j + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("3: Counter - " + i);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("4: Counter - " + i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println("5: " + j + " ");
            }

            System.out.println("5: Counter - " + i);
        }
    }
}
