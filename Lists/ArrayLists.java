package Lists;

import java.util.ArrayList;
import java.util.List;

class ArrayLists {
    public static void main(String[] args) {
        System.out.println("This is arraylist");

        ArrayList<String> newList = new ArrayList<>();

        // adding
        newList.add("Sanjeet");
        newList.add("Lalan");
        newList.add("Sagar");
        newList.add("Ranjeet");
        newList.add("Rambilash");

        System.out.println(newList);

        // adding at some index
        newList.add(2, "This is yese hi");

        System.out.println(newList);

        // contains
        System.out.println(newList.contains("Lalan"));

        // adding another arraylist in the the current arraylist
        List<String> anotherOne = new ArrayList<>();

        anotherOne.add("Man");
        anotherOne.add("Ramlal");
        anotherOne.add("MohanLal");

        newList.addAll(anotherOne);

        // getting
        System.out.println(newList.get(0));

        // updating the value by index
        newList.set(2, "Moahanaa");

        System.out.println(newList);

        // removing by index
        newList.remove(3);

        // removing by value
        newList.remove(String.valueOf("Sanjeet"));

        // iterating
        for (String str : newList) {
            System.out.println(str);
        }

        // clearing whole
        newList.clear();
    }
}