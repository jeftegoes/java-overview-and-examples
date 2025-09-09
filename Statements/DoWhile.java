public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.println("Counter: " + counter++);
        } while (counter < 5);

        do {
            System.out.println("Counter is five already: " + counter);
        } while (counter < 5);
    }
}