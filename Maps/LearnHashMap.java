package Maps;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        // adding to hashmap
        numbers.put("one", 1);
        numbers.put("two", 2);

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

        System.out.println(numbers);

    }
}
