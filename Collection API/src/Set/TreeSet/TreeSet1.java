/**

   * Sorted interface extends Set Interface and Sorted Interface implements by TreeSet

   * Only Homogeneous data can be stored.

   * TreeSet uses tree data structure for storage. ( BinarySearchTree )

   * Always Data is Stored in Sorted Order.

   * If Tree is Balance Tree then searching operation is taking less time Complexity otherwise
     it takes O(n).

   * Duplicates Not Allowed if you are trying to add duplicates the duplicate data stored only one time.



   When we can use TreeSet.

    * If you have to need data is stored in Sorted order and duplicate data will not store then
      you can go through TreeSet.





 */




package Set.TreeSet;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();

        treeSet.add(45);
//        treeSet.add("akash");
        treeSet.add(98);
        treeSet.add(9);
        treeSet.add(23);
        treeSet.add(100);
        treeSet.add(67);
        treeSet.add(100);

        System.out.println(treeSet);

        System.out.println(treeSet.ceiling(100));
        System.out.println(treeSet.floor(100));
        System.out.println(treeSet.floor(67));

        System.out.println(treeSet.higher(100));
        System.out.println(treeSet.higher(67));
        System.out.println(treeSet.lower(100));

        System.out.println("************* Data Not present **********");

        System.out.println(treeSet.lower(40));
        System.out.println(treeSet.higher(40));
        System.out.println(treeSet.ceiling(40));
        System.out.println(treeSet.floor(40));
        System.out.println(treeSet.ceiling(45));



        System.out.println("\n\nReverse of TreeSet Using LinkedList listIterator");


        LinkedList linkedList = new LinkedList();

        linkedList.addAll(treeSet);

        ListIterator listIterator = linkedList.listIterator(linkedList.size());

        while (listIterator.hasPrevious())
               System.out.println(listIterator.previous());





    }


}
