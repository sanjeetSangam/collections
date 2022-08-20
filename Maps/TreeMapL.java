package Maps;

import java.util.Map;
import java.util.TreeMap;

// same as hashmap but in treemap, elements are kept in sorted manner

public class TreeMapL {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();

        // adding to hashmap
        numbers.put("two", 2);
        numbers.put("one", 1);

        // if key is not present only add method
        numbers.putIfAbsent("two", 56);

        // iterating hashmap
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println("key - " + e.getKey());
            System.out.println("value - " + e.getValue());
        }

        // only for key iterating
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        // contains methods
        System.out.println(numbers.containsKey("one"));
        System.out.println(numbers.containsValue(5));

        // isEmpty
        System.out.println(numbers.isEmpty());

        // remove
        numbers.remove("one");

        System.out.println(numbers);
    }
}
