/**

 * all methods inside Hashtable is Synchronized means at a time only one thread will run this
    therefore, Hashtable is thread-safe

 * all methods inside HashMap is non-Synchronized means at a time one or more thread will run this
   methods therefore, it is not thread-safe.

 * MultiThreading is Possible in HashMap but, it is not possible in Hashtable.

 * HashMap Performance is high compare to Hashtable.

 * Hashtable is introduces in Java 1.0

 * Hashtable is Legacy Class.

 */


package Hashtable;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Hashtable1 {

    public static void main(String[] args) {


        Hashtable hashtable = new Hashtable();

        Integer integer = 3;
        Integer integer1 = 5;
        Integer integer2 = 9;
        Integer integer3 = 10;

        hashtable.put(integer , 45);
        hashtable.put(integer1,"Ankit");
        hashtable.put(4,integer2);
        hashtable.put("ketan" , integer3);

        System.out.println(hashtable);


        System.out.println("\n\n");
        Collection collection = hashtable.entrySet();

        Iterator iterator = collection.iterator();

        while (iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry) iterator.next();

            System.out.println(entry.getKey() +"  " + entry.getValue());
        }
    }

}
