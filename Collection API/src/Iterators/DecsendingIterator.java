/**

   * It is available only in LinkedList , ArrayDeque and TreeSet


 */

package Iterators;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DecsendingIterator {

    public static void main(String[] args) {


        ArrayDeque arrayDeque = new ArrayDeque();

        arrayDeque.add(100);
        arrayDeque.add(200);
        arrayDeque.add(300);
        arrayDeque.add(400);
        arrayDeque.add(500);

        System.out.println("Before Descending Iterator");
        System.out.print(arrayDeque+" ");


        System.out.println("\n\nAfter DescendingIterator");

         Iterator itr =  arrayDeque.descendingIterator();

         while (itr.hasNext()) {

             Integer i = (Integer) itr.next();
             System.out.print(i+ " ");

//             System.out.print(itr.next() + " ");
         }


    }
}
