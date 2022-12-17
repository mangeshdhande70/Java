/**


 * Internally use Dynamic Arrays Data Structure.
 * Duplicate Elements are Allowed.
 * Homogeneous as well Heterogeneous Data can be Stored.
 * Data Stored as object.
 * Data stored in contiguous memory location.
 * Data manipulation insertion, Deletion are not efficient as compare to LinkedList bcz of while inserting
   or deleting of data shifting of index is there so data manipulation in middle (except at rear end)
   is not done Efficiently.
 * It is implementing only List Interfaces.

 * we are able to add Object in ArrayList at any given index..

      1. Front ( Not recommended)
      2. Middle ( Not recommended)
      3. Rear  ( Recommended)

 * Default Initial capacity of ArrayList is 10.

 when we can use?

   * when we are not performing searching operation many times and, we have to just insertion of data at rear end
    then only we can through ArrayList.




 */

package List.ArrayList;

import java.util.ArrayList;

public class FirstProgram {

    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();

        arrayList.add("ankit");
        arrayList.add(23);
        arrayList.add(25);
        arrayList.add(27);
        arrayList.add(29);
        arrayList.add(31);
        arrayList.add("akash");
        arrayList.add('c');
        arrayList.add(45.5f);


        arrayList.add(new Integer(45));  // back ...data stored as Object but in simple array data is
                                              // stored as Primitive and whole array is Object


        System.out.println(arrayList);

        int sizes = arrayList.size();
        System.out.println(sizes);

        ArrayList arrayList2 = new ArrayList();

        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(7);
        arrayList2.add(9);
        arrayList2.add(1);
        arrayList2.add("mangesh");

        System.out.println(arrayList2);

        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

        boolean b = arrayList.contains(9);
        System.out.println(b);
        System.out.println(arrayList.contains(98));

        System.out.println(arrayList.get(5));

        Object bb = arrayList.get(5);
        System.out.println(bb);

        System.out.println("*******\n"+arrayList2);
        arrayList2.ensureCapacity(23); // total capacity ( occupied capacity + Vacant )
        System.out.println(arrayList2.size()); // occupied capacity

        arrayList2.trimToSize(); // it is trim to actual occupied array ( same to size )

        System.out.println(arrayList2.indexOf(9));
        System.out.println(arrayList2.indexOf(100));


    }


}
