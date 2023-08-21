
    import java.util.TreeMap;
import java.util.Map;

public class Q25_Treemap {
    public static void main(String[] args) {
        // Create a TreeMap of strings (sorted by natural order)
        TreeMap<String, Integer> scores = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        scores.put("Charlie", 75);

        // Print the TreeMap
        System.out.println("TreeMap: " + scores);

        // Get the value associated with a key
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Check if a key exists in the TreeMap
        boolean containsBob = scores.containsKey("Bob");
        System.out.println("Contains 'Bob'? " + containsBob);

        // Check if a value exists in the TreeMap
        boolean containsScore75 = scores.containsValue(75);
        System.out.println("Contains score 75? " + containsScore75);

        // Remove a key-value pair
        scores.remove("Charlie");
        System.out.println("TreeMap after removing 'Charlie': " + scores);

        // Iterate through the TreeMap using entrySet
        System.out.println("TreeMap key-value pairs:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Clear all elements from the TreeMap
        scores.clear();
        System.out.println("TreeMap after clearing: " + scores);
    }
}


