public class Main {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesInDay = 60 * 24;
            long minutesInYear = minutesInDay * 365;

            long years = minutes / minutesInYear;
            long remainingMinutes = minutes % minutesInYear;
            long days = remainingMinutes / minutesInDay;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
