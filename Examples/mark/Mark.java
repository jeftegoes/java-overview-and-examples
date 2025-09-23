public class Mark {
    String regNo;
    double mark[];

    public void initialize(int[] mark1) {
        mark1[0] = 40;
        mark1[1] = 50;
    }

    public static void main(String[] args) {
        int[] revalMark = new int[2];
        revalMark[0] = 10;
        revalMark[1] = 20;
        int totalMark = 0;

        for (int mark : revalMark) {
            totalMark += mark;
        }

        System.out.print(totalMark + " ");

        Mark a = new Mark();

        a.initialize(revalMark);

        for (int mark : revalMark) {
            totalMark += mark;
        }

        System.out.println(totalMark);
    }
}
