
    import java.util.Vector;

public class Q10_addMethodInVector {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Add elements to the Vector using the add() method
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println("Vector elements: " + vector);

        // Adding an element at a specific index
        vector.add(2, 25);

        System.out.println("Vector elements after adding at index 2: " + vector);
    }
}


