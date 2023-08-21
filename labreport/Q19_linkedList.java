
    import java.util.LinkedList;

public class Q19_linkedList {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> names = new LinkedList<>();

        // Add elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print the LinkedList
        System.out.println("LinkedList: " + names);

        // Get the size of the LinkedList
        int size = names.size();
        System.out.println("Size of LinkedList: " + size);

        // Access an element by index
        String firstElement = names.get(0);
        System.out.println("First element: " + firstElement);

        // Modify an element
        names.set(1, "Barbara");
        System.out.println("Modified LinkedList: " + names);

        // Check if the LinkedList contains an element
        boolean containsCharlie = names.contains("Charlie");
        System.out.println("Contains 'Charlie'? " + containsCharlie);

        // Find the index of an element
        int index = names.indexOf("Barbara");
        System.out.println("Index of 'Barbara': " + index);

        // Add an element at the beginning
        names.addFirst("Alex");
        System.out.println("LinkedList after adding at the beginning: " + names);

        // Add an element at the end
        names.addLast("David");
        System.out.println("LinkedList after adding at the end: " + names);

        // Remove the first element
        String removedFirst = names.removeFirst();
        System.out.println("Removed first element: " + removedFirst);
        System.out.println("LinkedList after removing first: " + names);

        // Remove the last element
        String removedLast = names.removeLast();
        System.out.println("Removed last element: " + removedLast);
        System.out.println("LinkedList after removing last: " + names);
    }
}


