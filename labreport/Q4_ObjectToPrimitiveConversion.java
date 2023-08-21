// package labreport;

public class Q4_ObjectToPrimitiveConversion {

    public static void main(String[] args) {
        // Converting wrapper objects to primitive types
        Integer integerObject = Integer.valueOf(42);
        int intValue = integerObject.intValue(); // Unboxing

        Double doubleObject = Double.valueOf(3.14);
        double doubleValue = doubleObject.doubleValue(); // Unboxing

        Character charObject = Character.valueOf('A');
        char charValue = charObject.charValue(); // Unboxing

        Boolean booleanObject = Boolean.valueOf(true);
        boolean booleanValue = booleanObject.booleanValue(); // Unboxing

        // Displaying the converted primitive values
        System.out.println("Int Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}
