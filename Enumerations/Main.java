public class Main {
    public enum Priority {
        HIGH,
        MEDIUM,
        LOW;
    }

    public enum Months {
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);

        private int daysAmount;

        private Months(int daysAmount) {
            this.daysAmount = daysAmount;
        }

        public int getDaysAmount() {
            return this.daysAmount;
        }
    }

    public static void main(String[] args) {
        Priority priority = Priority.HIGH;

        switch (priority) {
            case HIGH:
                System.out.println("High priority.");
                break;
            case MEDIUM:
                System.out.println("Medium priority.");
                break;
            case LOW:
                System.out.println("Low priority.");
                break;
        }

        Priority priority2 = Priority.valueOf("HIGH");
        System.out.println(priority2);

        System.out.println("priority == Priority.MEDIUM: " + (priority == Priority.MEDIUM));
        System.out.println("priority == Priority.HIGH: " + (priority == Priority.HIGH));

        System.out.println("priority.HIGH.ordinal(): " + priority.HIGH.ordinal());
        System.out.println("priority.MEDIUM.ordinal(): " + priority.MEDIUM.ordinal());

        Priority[] values = Priority.values();
        for (Priority priority3 : values) {
            System.out.println(priority3);
        }

        System.out.println("Months.JANUARY.getDaysAmount(): " + Months.JANUARY.getDaysAmount());
    }
}
