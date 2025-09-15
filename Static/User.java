public class User {
    public static final String DEFAULT_USER_GROUP = "CUSTOMERS";

    private static int counter;

    private int id;
    private String name;

    {
        id = ++counter;
    }

    public static void doAnyStaticThing() {
        System.out.println("Static method in User class is called.");
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
