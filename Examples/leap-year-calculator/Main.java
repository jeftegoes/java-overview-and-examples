public class Program {
    public static boolean isLeapYear(int year) {
        if (year < 1 && year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)
                || year % 400 == 0 && (year >= 1 && year <= 9999)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
