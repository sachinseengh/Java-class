import java.util.Hashtable;
import java.util.Enumeration;

public class Q11_Dictionary {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put("Alice", 25);
        hashtable.put("Bob", 30);
        hashtable.put("Charlie", 28);

        // Get values using keys
        int aliceAge = hashtable.get("Alice");
        int bobAge = hashtable.get("Bob");
        int charlieAge = hashtable.get("Charlie");

        System.out.println("Alice's age: " + aliceAge);
        System.out.println("Bob's age: " + bobAge);
        System.out.println("Charlie's age: " + charlieAge);

        // Check if the Hashtable contains a key
        boolean containsKey = hashtable.containsKey("Bob");
        System.out.println("Contains key 'Bob'? " + containsKey);

        // Check if the Hashtable contains a value
        boolean containsValue = hashtable.containsValue(22);
        System.out.println("Contains value 22? " + containsValue);

        // Remove a key-value pair
        hashtable.remove("Alice");

        System.out.println("Hashtable after removing key 'Alice': " + hashtable);

        // Iterate through the Hashtable using Enumeration
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            int age = hashtable.get(key);
            System.out.println(key + " is " + age + " years old.");
        }
    }
}
