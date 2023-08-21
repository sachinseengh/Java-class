
import java.util.HashMap;
import java.util.Map;

public class Q14_MapInterface {
    public static void main(String[] args) {
        // Create a Map using the HashMap implementation
        Map<String, Integer> scores = new HashMap<>();

        // Add key-value pairs to the Map
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        scores.put("Charlie", 75);

        // Retrieve values using keys
        int aliceScore = scores.get("Alice");
        int bobScore = scores.get("Bob");
        int charlieScore = scores.get("Charlie");

        System.out.println("Alice's score: " + aliceScore);
        System.out.println("Bob's score: " + bobScore);
        System.out.println("Charlie's score: " + charlieScore);

        // Check if a key exists in the Map
        boolean containsAlice = scores.containsKey("Alice");
        System.out.println("Contains key 'Alice'? " + containsAlice);

        // Check if a value exists in the Map
        boolean containsScore = scores.containsValue(90);
        System.out.println("Contains value 90? " + containsScore);

        // Update the value associated with a key
        scores.put("Bob", 88);

        System.out.println("Updated Bob's score: " + scores.get("Bob"));

        // Remove a key-value pair
        scores.remove("Charlie");

        System.out.println("Map after removing Charlie: " + scores);

        // Iterating through the Map entries
        System.out.println("Map entries:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
