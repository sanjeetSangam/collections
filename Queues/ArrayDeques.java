package Queues;

import java.util.ArrayDeque;

// this is used when elements are required to remove from the both end and to add both end as well. Also, peek can be done from the both the side.

// In other words, arraydeque can be used to implement both the stack and queue

class ArrayDeques {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // adding to the last index or in sequence
        adq.offer(45);
        // adding to the first at head
        adq.offerFirst(452);
        // adding to last by arraydeque method
        adq.offerLast(321);

        // peeking in arraydeque
        System.out.println(adq.peek()); // normal queue method for peek as it peek the element to be removed
        System.out.println(adq.peekFirst()); // peek the first element
        System.out.println(adq.peekLast()); // peek the last element

        // poll in arraydeque
        System.out.println(adq.poll()); // normal queue method for poll as it removes the first element
        System.out.println(adq.pollFirst()); // remove the first element
        System.out.println(adq.pollLast()); // removes the last element
    }

}