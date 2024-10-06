
import java.util.ArrayList;
import java.util.Arrays;

record BookItem(String name, String author, float price) {

}

public class Lists {
    public static void main(String args[]) {
        BookItem[] bookArray = new BookItem[2];

        bookArray[0] = new BookItem("Clean Architecture", "Uncle Bob", 10f);
        bookArray[1] = new BookItem("Domain Drive Design", "Erick Evans", 15f);

        System.out.println(Arrays.toString(bookArray));

        ArrayList<Object> objectList = new ArrayList<Object>();
        objectList.add(new BookItem("Design Patterns", "Erich Gamma", 30));
        objectList.add("Another Book");

        ArrayList<BookItem> bookList = new ArrayList<>();
        bookList.add(new BookItem("Refactoring", "Martin Fowler", 30));
        bookList.add(new BookItem("Clean Architecture", "Uncle Bob", 10f));
        bookList.add(new BookItem("Domain Drive Design", "Erick Evans", 15f));
        System.out.println(bookList);
    }
}
