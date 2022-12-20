/**


 * it is internally use HashTable and LinkedList Data Structure.

 * Order of insertion is preserved.

 * Storing the value in key value pair.

 * Note: In General we can Use LinkedHashSet and LinkedHashMap for developing Cache Based
         Applications where Duplicates are Not Allowed. But Insertion Order Must be Preserved.




 --------------------> Difference Between HashMap and LinkedHashMap <------------------------------------------


            HashMap                                 |                  LinkedHashMap
___________________________________________________________________________________________________________________

 1. The Underlying Data Structure is Hashtable.          1. The Underlying Data Structure is Combination of Hashtable
                                                            and LinkedList.

 2. Insertion is Not Preserved.                          2. Insertion Order is Preserved.

 3. Introduced in 1.2 Version.                           3. Introduced in 1.4 Version




 */



package LinkedHashMap;

import java.util.*;

public class LinkedHashMap1 {


    public static void main(String[] args) {


        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put(1,"Akash");  // call Entry
        linkedHashMap.put(3,"Rakesh");
        linkedHashMap.put(9,"Ketan");
        linkedHashMap.put(0,"Nitesh");
        linkedHashMap.put(8,89);

        System.out.println(linkedHashMap);

        linkedHashMap.put(0,90); // ----> it is updated existing value in present key

        Set set = linkedHashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry) iterator.next();

            System.out.println("Key : "+entry.getKey()+ " ---> Values  : "+entry.getValue());
        }


        System.out.println("***************************************************");

        LinkedHashMap linkedHashMap1 = new LinkedHashMap(12);

        linkedHashMap1.put(1,34);
        linkedHashMap1.put(3,34);
        linkedHashMap1.put(6,"Mangesh");
        linkedHashMap1.put(9.5 , "Ketan");
        linkedHashMap1.put("akash" , 23);

        System.out.println(linkedHashMap1);

        LinkedHashMap linkedHashMap2 = new LinkedHashMap(12,.8f);

        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap1);
        System.out.println(linkedHashMap3);




    }


}
