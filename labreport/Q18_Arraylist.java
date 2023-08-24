import java.util.ArrayList;
import java.util.Collections;

public class Q18_Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Access an element by index
        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        // Modify an element
        numbers.set(1, 25);
        System.out.println("Modified ArrayList: " + numbers);

        // Check if the ArrayList contains an element
        boolean contains30 = numbers.contains(30);
        System.out.println("Contains 30? " + contains30);

        // Find the index of an element
        int index = numbers.indexOf(40);
        System.out.println("Index of 40: " + index);

        // Sort the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Remove an element by value
        boolean removed = numbers.remove(Integer.valueOf(25));
        System.out.println("Removed 25? " + removed);
        System.out.println("ArrayList after removal: " + numbers);

        // Clear all elements from the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);
    }
}


