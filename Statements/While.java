public class While {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 5) {
            System.out.println("Counter: " + counter++);
        }

        // Infinite loop
        // while (true) {
        // System.out.println("Infinite loop...");
        // }

        int count = 0;
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            while (!flag) {
                count++;
                if (++i < count) {
                    flag = true;
                }
            }
        }
        System.out.println(count);
    }
}
