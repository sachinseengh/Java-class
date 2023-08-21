
    import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q22_Iterator {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get an Iterator for the List
        Iterator<String> iterator = fruits.iterator();

        // Traverse the List using the Iterator
        System.out.println("List elements using Iterator:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Create a new Iterator (since the previous one has been consumed)
        Iterator<String> newIterator = fruits.iterator();

        // Remove an element using the Iterator
        while (newIterator.hasNext()) {
            String fruit = newIterator.next();
            if (fruit.equals("Banana")) {
                newIterator.remove();
            }
        }

        System.out.println("List after removing 'Banana': " + fruits);
    }
}


