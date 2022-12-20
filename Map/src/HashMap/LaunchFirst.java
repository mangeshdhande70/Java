/**


 --- The Map interface is not a subtype of the Collection interface

   * The HashMap is an implementation of hash table data structure.

   * It is a part of Map Api / MapHierarchy not Collection.

   * It stored the data in Key value pair and Key must be Unique.

   * HashMap contains an array of the nodes, and the node is represented as a class.
     It uses an array and LinkedList data structure internally for storing Key and Value.

   * In Map Interface there is no iterator Concept.

   * HashMap not preserve the order of Insertion.

   *  All Method Present in HashMap is Non-Synchronized.


 --------> Difference Between HashMap and Hashtable <-----------------------

 * all methods inside Hashtable is Synchronized means at a time only one thread will run this
   therefore, Hashtable is thread-safe.

 * all methods inside HashMap is non-Synchronized means at a time one or more thread will run this
   methods therefore, it is not thread-safe.

 * MultiThreading is Possible in HashMap but, it is not possible in Hashtable.

 * HashMap Performance is high compare to Hashtable.

 * Hashtable is introduces in Java 1.0 &  HashMap is introduces in Java 1.2

 * Hashtable is Legacy Class.




 */



package HashMap;

import java.util.*;

public class LaunchFirst {

    public static void main(String[] args) {


        Map map = new HashMap();

        HashMap hashMap = new HashMap();

        hashMap.put(1,50); // Called Entry
        hashMap.put(2,60);
        hashMap.put(3,70);
        hashMap.put(4,80);
        hashMap.put(6,90);
        hashMap.put(8,90);
        hashMap.put(9 , "Akash");


        System.out.println(hashMap);


        System.out.println();


        System.out.println("***** Fetching Values Only *****");

        Collection collection = hashMap.values();

        Iterator iterator = collection.iterator();

        int i = 0;
        while (iterator.hasNext())
        {
            i++;
            System.out.println("Values "+i+" :"+iterator.next());
        }


        System.out.println("***** Fetching Keys Only *****");

        Collection collection1 = hashMap.keySet();

        Iterator iterator1 = collection1.iterator();

        int j=0;
        while (iterator1.hasNext())
        {
            j++;
            System.out.println("Keys "+i+" :"+iterator1.next());
        }


        System.out.println("***** Fetching Keys and Values Only *****");

        Set set = hashMap.entrySet();

        Iterator iterator2 = set.iterator();

        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();

            System.out.println("Key : " + entry.getKey() + "  " + "Values : " + entry.getValue());


            System.out.println("***************************************");

            Properties properties = new Properties();
            properties.put(34,45);
            System.out.println(properties);



        }

    }


}
