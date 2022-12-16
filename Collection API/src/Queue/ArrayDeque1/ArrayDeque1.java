/**

 * It is internally follows Double Ended Queue ( Insertion and Deletion can be done by both end ( Front and Rear ) ).

 * Duplicates are allowed.

 * Indexing is not allowed in ArrayDequeue.

 * Deque extends Queue Interface and ArrayDeque implements Deque interface.




 */



package Queue.ArrayDeque1;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDeque1 {

    public static void main(String[] args) {


        ArrayDeque arrayDeque = new ArrayDeque();

        arrayDeque.add("Mangesh");
        arrayDeque.addFirst("Rakesh");
        arrayDeque.add(345);
        arrayDeque.add(333);
        arrayDeque.add(333);

        System.out.println(arrayDeque);







    }


}
