/**


    In Case of HashMap, HashMap Dominates Garbage Collector. That is if Object doesn’t
     have any Reference Still it is Not Eligible for Garbage Collector if it is associated with
     HashMap.

    But In Case of WeakHashMap if an Object doesn't contain any References then it is Always
     Eligible for GC Even though it is associated with WeakHashMap. That is Garbage Collector
     Dominates WeakHashMap.

   Garbage Collector internally call finalized method to clean the object from heap.





 */

package WeakHashMapVsWeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class FirstProgram {

    public static void main(String[] args) {


        System.out.println("********* HashMap ************");

        HashMap hashMap = new HashMap();

        Integer i1 = new Integer(20);

        hashMap.put(i1 , "Mangesh");

        i1 = null;

        System.gc();

        System.out.println(hashMap);





        System.out.println("\n\n ************ WeakHashMap ****************");

        WeakHashMap weakHashMap = new WeakHashMap();

        Integer i2 = new Integer(20);

        weakHashMap.put(i2 , "Mangesh");

        i2 = null;

        System.gc();

        System.out.println(weakHashMap);





    }


}
