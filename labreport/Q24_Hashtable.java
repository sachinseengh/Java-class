
import java.util.Hashtable;
import java.util.Enumeration;

public class Q24_Hashtable {
    public static void main(String[] args) {
        // Create a Hashtable with String keys and Integer values
        Hashtable<String, Integer> scores = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        scores.put("Charlie", 75);

        // Get the value associated with a key
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Check if a key exists in the Hashtable
        boolean containsBob = scores.containsKey("Bob");
        System.out.println("Contains 'Bob'? " + containsBob);

        // Check if a value exists in the Hashtable
        boolean containsScore75 = scores.containsValue(75);
        System.out.println("Contains score 75? " + containsScore75);

        // Remove a key-value pair
        scores.remove("Charlie");
        System.out.println("Hashtable after removing 'Charlie': " + scores);

        // Iterate through the Hashtable using Enumeration
        Enumeration<String> keys = scores.keys();
        System.out.println("Hashtable key-value pairs:");
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            int value = scores.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Clear all elements from the Hashtable
        scores.clear();
        System.out.println("Hashtable after clearing: " + scores);
    }
}
