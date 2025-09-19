import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparable {
    public static void main(String[] args) {
        class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        System.out.println(" --- Integers --- ");
        List<Integer> integers = new ArrayList<>(List.of(1, 15, 2, 37, 100));
        System.out.println("Original list: " + integers);

        integers.sort(Comparator.reverseOrder());

        System.out.println("Reversed order: " + integers);

        integers.sort(Comparator.naturalOrder());

        List<User> users = new ArrayList<>(List.of(new User("Jefté", 34), new User("Brenno", 9)));

        for (User user : users) {
            System.out.println("Name: " + user.getName() + " Age: " + user.getAge());
        }

        users.sort(Comparator.comparingInt(User::getAge));
        users.sort(Comparator.comparingInt(user -> user.getAge()));
        // OR users.sort((a, b) -> Integer.compare(a.getAge(), b.getAge()));
        // OR users.stream().sorted(Comparator.comparingInt(user -> user.getAge()));

        for (User user : users) {
            System.out.println("Name: " + user.getName() + " Age: " + user.getAge());
        }


    }
}