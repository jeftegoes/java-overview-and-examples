public class TraditionalSwitch {
    public static void main(String[] args) {
        // int value = 1;

        // if (value == 1) {
        // System.out.println("Values was 1.");
        // } else if (value == 2) {
        // System.out.println("Values was 2.");
        // } else {
        // System.out.println("Was not 1 or 2.");
        // }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Values was 1.");
                break;
            case 2:
                System.out.println("Values was 2.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, or a 5.");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5.");
                break;
        }

        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");

        char natoWord = 'A';
        System.out.println(getNATOWord(natoWord));
    }

    public static String getQuarter(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2st";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3st";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4st";
            default:
                return "bad'";
        }
    }

    public static String getNATOWord(char natoWord) {
        switch (natoWord) {
            case 'A':
                return "A is able.";
            case 'B':
                return "B is baker.";
            case 'C':
                return "C is charlie.";
            case 'D':
                return "D is dog.";
            case 'E':
                return "E is easy.";
            default:
                return "Letter " + natoWord + " was not found in the switch.";
        }
    }
}