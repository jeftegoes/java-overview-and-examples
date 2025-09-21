import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        // Iterator.
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterator - Can't be reset automatically.
        if (!iterator.hasNext()) {
            System.out.println("If we are in this section that means there is no other elements in our iterator.");
        }

        // Iterator - Remove.
        iterator = integers.iterator();
        while (iterator.hasNext()) {
            int nextInt = iterator.next();
            if (nextInt % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(integers);

        // iterator = integers.iterator();
        // iterator.next();
        // iterator.remove();
        // System.out.println(integers);

        // Iterator - Remove error.
        // iterator = integers.iterator();
        // iterator.remove();
        // System.out.println(integers);

        // Iterator - Concurrent Modification between integers.remove(0) and iterator.next().
        // iterator = integers.iterator();
        // while (iterator.hasNext()) {
        //      integers.remove(0);
        //      int nextElement = iterator.next();
        //      System.out.println(nextElement);
        // }

        // Iterator - Fail-safe iterador.
        List<Integer> threadSafeList = new CopyOnWriteArrayList<>(integers);
        iterator = threadSafeList.iterator();
        threadSafeList.add(100);
        while (iterator.hasNext()) {
            threadSafeList.remove(0);
            int nextElement = iterator.next();
            System.out.println(nextElement);
        }

        System.out.println(threadSafeList);

        // Iterator - Weakly consistent iterator.
        Collection<Integer> deque = new ConcurrentLinkedDeque<>(integers);
        iterator = deque.iterator();
        deque.add(100);
        while (iterator.hasNext()) {
            int nextElement = iterator.next();
            System.out.println(nextElement);
        }

        System.out.println(deque);
    }
}