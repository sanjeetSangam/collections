package Queues;

// PriorityQueue is that which give priority to smallest element to get remove from the queue.

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioratyQueue {
    public static void main(String[] args) {

        Queue<String> nLink = new PriorityQueue<>();

        // adding to the PriorityQueue
        nLink.offer("sanjeet");
        nLink.offer("49");
        nLink.offer("sranjeet");

        System.out.println(nLink);

        // removing and returning the value
        System.out.println(nLink.poll());

        // getting the to be removed value
        System.out.println(nLink.peek());

        System.out.println(nLink);

        // making PriorityQueue work like bigger remove first
        // --------------------------------------------------

        Queue<String> nLink1 = new PriorityQueue<>(Comparator.reverseOrder());
        nLink1.offer("sanjeet");
        nLink1.offer("49");
        nLink1.offer("sranjeet");

        System.out.println(nLink1);

        System.out.println(nLink1.poll());

        System.out.println(nLink1.peek());
        System.out.println(nLink1);

    }
}
