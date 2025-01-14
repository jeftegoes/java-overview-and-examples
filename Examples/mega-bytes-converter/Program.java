public class Program {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            int XX = kiloBytes;

            int YY = (int) (kiloBytes / 1024);

            int ZZ = kiloBytes % 1024;

            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
