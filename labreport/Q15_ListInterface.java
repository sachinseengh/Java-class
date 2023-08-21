import java.util.ArrayList;
import java.util.List;

public class Q15_ListInterface {
    public static void main(String[] args) {
        // Create a List using the ArrayList implementation
        List<String> fruits = new ArrayList<>();

        // Add elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements by index
        String firstFruit = fruits.get(0);
        String secondFruit = fruits.get(1);
        String thirdFruit = fruits.get(2);

        System.out.println("First fruit: " + firstFruit);
        System.out.println("Second fruit: " + secondFruit);
        System.out.println("Third fruit: " + thirdFruit);

        // Check if an element exists in the List
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Contains 'Apple'? " + containsApple);

        // Find the index of an element
        int bananaIndex = fruits.indexOf("Banana");
        System.out.println("Index of 'Banana': " + bananaIndex);

        // Update an element at a specific index
        fruits.set(1, "Mango");

        // Remove an element by index
        fruits.remove(0);

        System.out.println("List after removing first element and updating second element: " + fruits);

        // Iterate through the List using a for-each loop
        System.out.println("List elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements from the List
        fruits.clear();

        System.out.println("List after clearing all elements: " + fruits);
    }
}
