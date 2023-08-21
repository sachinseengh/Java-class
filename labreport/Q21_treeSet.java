
    import java.util.TreeSet;
import java.util.Set;

public class Q21_treeSet {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        Set<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Print the TreeSet
        System.out.println("TreeSet: " + numbers);

        // Add a duplicate element
        boolean addedDuplicate = numbers.add(10);
        System.out.println("Added duplicate 10? " + addedDuplicate);

        // Check if an element exists in the TreeSet
        boolean contains30 = numbers.contains(30);
        System.out.println("Contains 30? " + contains30);

        // Remove an element from the TreeSet
        boolean removed20 = numbers.remove(20);
        System.out.println("Removed 20? " + removed20);

        // Print the elements in the TreeSet using a for-each loop
        System.out.println("TreeSet elements:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Clear all elements from the TreeSet
        numbers.clear();
        System.out.println("TreeSet after clearing: " + numbers);
    }
}


