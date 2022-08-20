package Lists;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> lst = new Stack<>();

        // adding to the stack
        lst.push(2);

        // seeing the top of the stack
        System.out.println(lst.peek());

        System.out.println(lst);

        // removing from the top of the stack
        lst.pop();

        System.out.println(lst);
    }
}
