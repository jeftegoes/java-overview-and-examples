import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100)); // 0 .. 99
        System.out.println(random.nextInt(100) + 1); // 1 .. 100
    }
}
