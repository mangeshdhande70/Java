/**


 * TreeMap stores key-value pairs. The main difference is that TreeMap sorts the key in ascending order.
 * TreeMap is sorted on the basis of key and key always have to be unique and homogeneous.
 * if you use Heterogeneous in key then it gives a ClassCastException while you directly printing.


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


        System.out.println(treeMap);


    }


}
