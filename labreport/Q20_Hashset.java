
    import java.util.HashSet;
import java.util.Set;

public class Q20_Hashset {
    public static void main(String[] args) {
        // Create a HashSet of strings
        Set<String> colors = new HashSet<>();

        // Add elements to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print the HashSet
        System.out.println("HashSet: " + colors);

        // Add a duplicate element
        boolean addedDuplicate = colors.add("Red");
        System.out.println("Added duplicate 'Red'? " + addedDuplicate);

        // Check if an element exists in the HashSet
        boolean containsGreen = colors.contains("Green");
        System.out.println("Contains 'Green'? " + containsGreen);

        // Remove an element from the HashSet
        boolean removedBlue = colors.remove("Blue");
        System.out.println("Removed 'Blue'? " + removedBlue);

        // Print the elements in the HashSet using a for-each loop
        System.out.println("HashSet elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Clear all elements from the HashSet
        colors.clear();
        System.out.println("HashSet after clearing: " + colors);
    }
}


