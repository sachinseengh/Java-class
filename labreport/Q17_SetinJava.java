
    import java.util.HashSet;
import java.util.Set;

public class Q17_SetinJava {
    public static void main(String[] args) {
        // Create a Set using the HashSet implementation
        Set<String> uniqueNames = new HashSet<>();

        // Add elements to the Set
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Charlie");

        // Try adding a duplicate element
        boolean addedDuplicate = uniqueNames.add("Alice");
        System.out.println("Added duplicate 'Alice'? " + addedDuplicate);

        // Check if an element exists in the Set
        boolean containsBob = uniqueNames.contains("Bob");
        System.out.println("Contains 'Bob'? " + containsBob);

        // Remove an element from the Set
        boolean removedAlice = uniqueNames.remove("Alice");
        System.out.println("Removed 'Alice'? " + removedAlice);

        // Print the elements in the Set using a for-each loop
        System.out.println("Set elements:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        // Clear all elements from the Set
        uniqueNames.clear();

        System.out.println("Set after clearing all elements: " + uniqueNames);
    }
}



