/**

 * It follows Hashing Algorithm.
 * Hashset internally uses Hashmap for its implementation.
 * It uses Hash function associated with Hashtable and has 75% load-factor.
 * Duplicates are not Allowed and, it is not allowed index based Accessing.
 * It is not follows the order of data insertion


 */


package Set.HashSet;

import java.util.HashSet;

public class HashSet1 {


    public static void main(String[] args) {


        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(30);

        System.out.println(hashSet);


    }


}
