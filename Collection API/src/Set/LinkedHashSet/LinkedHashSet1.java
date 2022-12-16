
/**

        * It follows Hashing Algorithm.
        * It uses Hash function associated with Hashtable and has 75% load-factor.
        * Duplicates are not Allowed and, it is not allowed index based Accessing.
        * It is preserved the order of data insertion.



 **/


package Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {


    public static void main(String[] args) {


        LinkedHashSet linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        linkedHashSet.add(30);

        System.out.println(linkedHashSet);
    }

}
