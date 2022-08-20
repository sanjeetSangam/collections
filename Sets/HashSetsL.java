package Sets;

import java.util.HashSet;
import java.util.Set;

// Even order of elements that are inseted in this, are not kept in sequence as it was inserted.

public class HashSetsL {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

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
