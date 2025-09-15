import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Jefté");
        System.out.println("User ID: " + user1.getId() + ", Name: " + user1.getName());

        User user2 = new User();
        user2.setName("Brenno");
        System.out.println("User ID: " + user2.getId() + ", Name: " + user2.getName());

        System.out.println("Total users created: " + User.getCounter());

        user2.doAnyStaticThing();
        User.doAnyStaticThing();

        Employee employee1 = new Employee();
        employee1.setName("Charlie");
        System.out.println("Employee ID: " + employee1.getId() + ", Name: " + employee1.getName());

        User user3 = new Employee();
        user3.doAnyStaticThing();

        Employee.doAnyStaticThing();
        int[] arr1 = {3, 2, 1};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {6, 5, 4};
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));
    }
}
