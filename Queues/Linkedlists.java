package Queues;

import java.util.LinkedList;
import java.util.Queue;

// linkedlist is a class which can implement different interfaces

public class Linkedlists {
    public static void main(String[] args) {

        Queue<Integer> nLink = new LinkedList<>();

        // adding to the linkedlist
        nLink.offer(45);
        nLink.offer(46);
        nLink.offer(48);

        System.out.println(nLink);

        // removing and returning the value
        System.out.println(nLink.poll());

        // getting the to be removed value
        System.out.println(nLink.peek());

        System.out.println(nLink);

    }
}
