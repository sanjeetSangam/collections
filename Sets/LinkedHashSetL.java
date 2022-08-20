package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

// this is almost same as hashset but in this, order of elements are maintained

public class LinkedHashSetL {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        // adding
        set.add(4);
        set.add(5);
        set.add(56);
        set.add(566);
        set.add(5663);

        // removing elements
        System.out.println(set.remove(564));

        // contains
        System.out.println(set.contains(56));

        // empty or not
        System.out.println(set.isEmpty());

        // size
        System.out.println(set.size());

        // clearing the set
        set.clear();
    }
}
