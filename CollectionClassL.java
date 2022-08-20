import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassL {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5);
        list.add(564);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(10);

        // min element from arraylist
        System.out.println(Collections.min(list));

        // max element
        System.out.println(Collections.max(list));

        // frequency
        System.out.println(Collections.frequency(list, 5));

        // sorting or reverse
        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
