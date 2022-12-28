package Comparable;

import java.util.TreeSet;

public class TreeSetUseComparable {


    public static void main(String[] args) {


        TreeSet treeSet = new TreeSet();

        treeSet.add("A"); // Root Node we can't change
        treeSet.add("Z"); // "Z".compareTo("A") -> +ve --> right
        treeSet.add("L"); // "L".compareTo("A") -> +ve --> right next-->
                          //  "L".compareTo("Z") ->
        treeSet.add("B");






    }



}
