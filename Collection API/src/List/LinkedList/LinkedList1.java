/**


   * Internally use Doubly Liked List Data Structure.

   * Duplicate Elements are Allowed.

   * Homogeneous as well Heterogeneous Data can be Stored.

   * Data Stored as object.

   * Data Not stored in contiguous memory location  .. it is stored disperce memory location.

   * Data manipulation insertion, Deletion are efficient as compare to ArrayList bcz of while inserting
     or deleting of data shifting of index is not there only simple linking is there so data manipulation
     in LinkedList is in Efficient manner.

   * It is implementing List and Deque Interfaces.



 when we can use?

 * If we not perform searching operation many times but, we have to insert data or deletion data operation
   then we can through Linked List.



 *
 */


package List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add(34);
        linkedList.add("akash");
        linkedList.add("ankit");;;;
        linkedList.addFirst(22);
        linkedList.add(45.5);
        linkedList.addLast("ketan");
        linkedList.add(45.5);
        linkedList.addLast(76);

        System.out.println(linkedList);

//        linkedList



        System.out.println(linkedList);

        System.out.println(linkedList.contains("ketan"));

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.indexOf(45.5));

        System.out.println(linkedList.lastIndexOf(45.5));



        LinkedList linkedList1 = new LinkedList();

        linkedList1.add(4);
        linkedList1.addFirst(2);
        linkedList1.add(4);
        linkedList1.addLast("ketan");
        linkedList1.add(4.5);

        System.out.println("LinkedList\n"+linkedList);
        System.out.println("LinkedList 1\n"+linkedList1);

        linkedList.peekFirst();
        System.out.println("After Peek\n"+linkedList); // no affect in Existing Listr
        linkedList1.poll();
        System.out.println("After Poll\n"+linkedList1); // the element is fetched and remove from List




        System.out.println("*******************************************************************");

//        LinkedList list = new LinkedList(20);  ---> Not Possible there is no such constructor


        ArrayList arrayList = new ArrayList();
        arrayList.add(45);
        arrayList.add(65);
        arrayList.add("Mangesh");

        LinkedList list=new LinkedList(arrayList);

        System.out.println(list);



    }

}
