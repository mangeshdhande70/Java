/**


  * Only Homogeneous data can be Stored.

  * always give higher priority to small no & data not be sorted.

  * it follows in-order LVR Principle. (left value right).

  * Internally its follows Min-Heap DS.

  * Indexing accessing is not allowed.


  When we can use?

     * if User want to the higher priority no always stored in First Index then we can use PriorityQueue



 */




package Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.add(45);
    //   priorityQueue.add("aksh");
        priorityQueue.add(4);
        priorityQueue.add(9);
        priorityQueue.add(67);
        priorityQueue.add(34);
        priorityQueue.add(00);
        priorityQueue.add(34);
        priorityQueue.add(34);
//        priorityQueue.add("akash");  giving error while printing

        System.out.println(priorityQueue);


        System.out.println("****************************");

        PriorityQueue priorityQueue1 = new PriorityQueue();

        priorityQueue1.add(10);
        priorityQueue1.add(8);
        priorityQueue1.add(5);
        priorityQueue1.add(15);
        priorityQueue1.add(6);
        priorityQueue1.add(6);



        System.out.println(priorityQueue1);

        priorityQueue1.remove();

        System.out.println(priorityQueue1);






    }
}
