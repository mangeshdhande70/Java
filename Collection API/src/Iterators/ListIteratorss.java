/**

    * It is available only in List Interface ( In ArrayList Class & in LinkedList Class )

 */


package Iterators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class ListIteratorss {

    public static void main(String[] args) {


        ArrayList arrayList2 = new ArrayList();

        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(7);
        arrayList2.add(9);
        arrayList2.add(1);


        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());

        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous()+" ");


        TreeSet treeSet = new TreeSet();

        treeSet.add(45);
        treeSet.add(56);
        treeSet.add(1);
        treeSet.add(5);

        System.out.println("Set");

        System.out.println(treeSet);

        System.out.println("Reverse of TreeSet");

        LinkedList linkedList = new LinkedList();
        linkedList.addAll(treeSet);

        ListIterator listIterator1 = linkedList.listIterator(linkedList.size());

        while (listIterator1.hasPrevious())
            System.out.print(listIterator1.previous()+" ");






    }


}
