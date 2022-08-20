package Sets;

import java.util.Set;
import java.util.TreeSet;

// in this, elements are kept in sorted format

public class TreeSetL {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        // adding
        set.add(4);
        set.add(5);
        set.add(5663);
        set.add(56);
        set.add(566);

        // removing elements
        System.out.println(set.remove(564));

        // contains
        System.out.println(set.contains(56));

        // empty or not
        System.out.println(set.isEmpty());

        // size
        System.out.println(set.size());

        System.out.println(set);

        // clearing the set
        set.clear();
    }
}
