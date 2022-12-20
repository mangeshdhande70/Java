package TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class InterConversion {


    public static void main(String[] args) {


        SortedMap sortedMap = new TreeMap();

        sortedMap.put(6,45);
        sortedMap.put(1,9);
        sortedMap.put(3,89);
        sortedMap.put(0,90);
        sortedMap.put(8,0);



        System.out.println(sortedMap);


        System.out.println("********** Inter Conversion Between Map Object  *************");
        // by using this you can use specialized method of Treemap

        TreeMap treeMap = new TreeMap(sortedMap);

        Object o1 = treeMap.ceilingEntry(8);   // this method not available in SortedMap interface
        System.out.println("o1 = "+o1);

        Object o2 = treeMap.ceilingKey(9);       // this method not available in SortedMap interface
        System.out.println("o2 = "+o2 );


        System.out.println(treeMap);






    }


}
