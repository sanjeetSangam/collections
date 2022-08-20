package custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        // Set<Student> studentSet = new HashSet<>();
        ArrayList<Student> studentSet = new ArrayList<>();

        studentSet.add(new Student("Sanjeet", 4));
        studentSet.add(new Student("Sangam", 5));
        studentSet.add(new Student("Lalan", 8));
        studentSet.add(new Student("Mohan", 4));

        // sortind method in arraylist
        Collections.sort(studentSet, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(studentSet);
    }
}
