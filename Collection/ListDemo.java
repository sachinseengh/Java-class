// package Collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        // Creating a list
        List<String> list = new ArrayList<String>();

        // Adding elements in the list
        list.add("samsung");
        list.add("Apple");
        list.add("Nokia");
        list.add("LG");

        // Iterating the List element using for each loop

        for (String brand : list) {
            System.out.println(brand);
        }
        Boolean st = list.contains("LG");
        System.out.println(st);

    }
}
