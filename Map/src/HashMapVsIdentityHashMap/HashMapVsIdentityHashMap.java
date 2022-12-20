/**

 It is Exactly Same as HashMap Except the following Difference.

       In HashMap JVM will Use .equals() to Identify Duplicate Keys, which is Meant for
         Content Comparison.

       In IdentityHashMap JVM will Use == Operator to Identify Duplicate Keys, which is Meant
        for Reference Comparison.


 */




package HashMapVsIdentityHashMap;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class HashMapVsIdentityHashMap {


    public static void main(String[] args) {


        LinkedHashMap linkedHashMap = new LinkedHashMap();

        Integer a$ = new Integer(10);
        Integer $a = new Integer(10);

        linkedHashMap.put(a$ , "pawan");
        linkedHashMap.put($a , "Akash");

        System.out.println("*********  HashMap **********");

        System.out.println(linkedHashMap);


        System.out.println("\n\n*********  IdentityHashMap **********");

        IdentityHashMap identityHashMap = new IdentityHashMap();


        identityHashMap.put(a$ , "pawan");
        identityHashMap.put($a , "Akash");

        System.out.println(identityHashMap);


        System.out.println("\n\n********* Using Same Key **********");

        identityHashMap.put(12,"Mangesh");
        identityHashMap.put(12,"Ketan");

        System.out.println(identityHashMap);



    }


}
