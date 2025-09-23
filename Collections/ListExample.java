import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


record BookItem(String name, String author, float price) {

}

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

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("apple");
        list.add("orange");
        System.out.println("list.remove(): " + list.remove("Apple"));

        List<Double> doubleList = new ArrayList<>();
        // System.out.println(doubleList.get(doubleList.size())); // Runtime error.
        // doubleList.add(1); // Compilation Error.
        // System.out.println(list.indexOf(1.0)); // Runtime error.

        BookItem[] bookArray = new BookItem[2];

        bookArray[0] = new BookItem("Clean Architecture", "Uncle Bob", 10f);
        bookArray[1] = new BookItem("Domain Drive Design", "Erick Evans", 15f);

        System.out.println(Arrays.toString(bookArray));

        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add(new BookItem("Design Patterns", "Erich Gamma", 30));
        objectList.add("Another Book");

        ArrayList<BookItem> bookList = new ArrayList<>();
        bookList.add(new BookItem("Refactoring", "Martin Fowler", 30));
        bookList.add(new BookItem("Clean Architecture", "Uncle Bob", 10f));
        bookList.add(new BookItem("Domain Drive Design", "Erick Evans", 15f));
        System.out.println(bookList);
    }
}