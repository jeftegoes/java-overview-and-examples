public class EnhancedSwitch {
    public static void main(String[] args) {
        int switchValue = 4;

        switch (switchValue) {
            case 1 -> System.out.println("Values was 1.");
            case 2 -> System.out.println("Values was 2.");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5.");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5.");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2st";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3st";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4st";
            default -> {
                String badResponse = month + " is bad.";
                yield badResponse;
            }
        };
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }
}