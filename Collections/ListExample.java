import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        class Pet {
            private String name;

            public Pet(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        List list1 = new ArrayList<>(); // List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // Non-generic list.
        list1.add("some string");
        list1.add(1);
        Object object = list1.get(1);
        System.out.println(object);

        // Generic list.
        list2.add("some string");
        // list2.add(1); // Compilation error! Can't add integer.
        String string = list2.get(0);
        System.out.println(string);

        // LinkedList.
        list2 = new LinkedList<>();
        list2.add("another string");
        System.out.println(list2.get(0));

        // Initialization.
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(list3.get(1));
        System.out.println(list3);

        for (Integer i : list3) {
            System.out.println(i);
        }
        list3.clear();
        System.out.println(list3);

        List<Pet> list4 = new ArrayList<>(
                List.of(
                        new Pet("Dora"),
                        new Pet("Sabrina")
                )
        );

        for (Pet pet : list4) {
            System.out.println(pet.getName());
        }
    }
}