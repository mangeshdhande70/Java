/**


 * it is internally use HashTable and LinkedList Data Structure.

 * Order of insertion is preserved.

 * Storing the value in key value pair.




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



    }


}
