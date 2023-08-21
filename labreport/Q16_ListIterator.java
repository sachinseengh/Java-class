
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q16_ListIterator {
    public static void main(String[] args) {
        // Create a List using the ArrayList implementation
        List<String> colors = new ArrayList<>();

        // Add elements to the List
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Create a ListIterator
        ListIterator<String> iterator = colors.listIterator();

        // Forward traversal using ListIterator
        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            int index = iterator.nextIndex();
            String color = iterator.next();
            System.out.println("Index: " + index + ", Color: " + color);
        }

        // Backward traversal using ListIterator
        System.out.println("\nBackward traversal:");
        while (iterator.hasPrevious()) {
            int index = iterator.previousIndex();
            String color = iterator.previous();
            System.out.println("Index: " + index + ", Color: " + color);
        }

        // Modify elements using ListIterator
        ListIterator<String> modifyIterator = colors.listIterator();
        while (modifyIterator.hasNext()) {
            String originalColor = modifyIterator.next();
            String modifiedColor = originalColor.toUpperCase();
            modifyIterator.set(modifiedColor);
        }

        System.out.println("\nList after modifying elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Add new elements using ListIterator
        modifyIterator.add("Yellow");
        modifyIterator.add("Purple");

        System.out.println("\nList after adding new elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Remove an element using ListIterator
        modifyIterator.next();
        modifyIterator.remove();

        System.out.println("\nList after removing an element:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
