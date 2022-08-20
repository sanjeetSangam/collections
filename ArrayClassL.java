import java.util.Arrays;

public class ArrayClassL {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // performing binary search with inbuilt java method in array
        int index = Arrays.binarySearch(a, 4);
        System.out.println(index);

        // sorting default in arrays
        Arrays.sort(a);

        // fill method for array
        Arrays.fill(a, 1212);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
