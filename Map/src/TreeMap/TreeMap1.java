/**


 * The Underlying Data Structure is Red -Black Tree.

 * Duplicate Keys are Not Allowed. But Values can be Duplicated.

 * Insertion Order is Not Preserved and, it is Based on Some Sorting Order of Keys.

 * If we are depending on Default Natural Sorting Order then the Keys should be Homogeneous and Comparable.
   Otherwise, we will get Runtime Exception Saying ClassCastException.

 * If we are defining Our Own Sorting by Comparator then Keys can be Heterogeneous and NonComparable.
   But there are No Restrictions on Values. They can be Heterogeneous and Non-Comparable.

 * TreeMap stores key-value pairs. The main difference is that TreeMap sorts the key in ascending order.

 * TreeMap is sorted on the basis of key and key always have to be unique and homogeneous.

 * if you use Heterogeneous in key then it gives a ClassCastException while you directly printing.



    null Acceptance:
 ____________________________________________________________________________________

           For Empty TreeMap as the 1st Entry with null Key is Allowed. But After inserting that
            Entry if we are trying to Insert any Other Entry we will get RE: NullPointerException.

           For Non-Empty TreeMap if we are trying to Insert null Entry then we will get Runtime
            Exception Saying NullPointerException.

          There are No Restrictions on null Values

 */


package TreeMap;

import java.util.TreeMap;

public class TreeMap1 {


    public static void main(String[] args) {


        TreeMap treeMap = new TreeMap();



        treeMap.put(4,400);
        treeMap.put(2,200);
        treeMap.put(5,500);
        treeMap.put(1,100);
        treeMap.put(3,300);
        treeMap.put(0,"Ketan");
      //  treeMap.put("ke",87);-----> ClassCastException if u trying to print

     //   treeMap.put(null , "Mangesh"); ---> if we trying to add null in key then we will get NullPointerException

        treeMap.put(5 , null);
        treeMap.put(56,null);  // Value can be null


        System.out.println(treeMap);


        System.out.println("***************");

        TreeMap treeMap1 = new TreeMap();

        treeMap1.put(null , "Hey legend");
        System.out.println(treeMap1);


    }


}
