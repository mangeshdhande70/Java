package Comparator.Base;


import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {

        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;



        // Ascending Sorting Order
//        return (i1 < i2 ?-1:(i1==i2)?0:1);


        // Descending Sorting Order
//        return (i1 > i2 ?-1:(i1==i2)?0:1);


        //  Ascending Sorting Order
        // return i1.compareTo(i2);

        // Descending Sorting Order
        // return -i1.compareTo(i2);

        // Descending Sorting Order
         // return i2.compareTo(i1);

        // Ascending Sorting Order
        // return -i2.compareTo(i1);

        return -i1.compareTo(i2);


        /**


         i1.compareTo(i2) =======> Ascending Sorting Order

        -i1.compareTo(i2) =======> Descending Sorting Order

         i2.compareTo(i1) =======> Descending Sorting Order

        -i2.compareTo(i1) =======> Ascending Sorting Order

         return +1        =======> insertion order

         return -1        =======> reverse of insertion order

         return 0        =======> only print Root Element ( First Element )



          */


    }


}

public class WaysToAchieveSortingOrderUsingComparator {


    public static void main(String[] args) {


        TreeSet treeSet = new TreeSet(new MyComparator1());

        treeSet.add(20);
        treeSet.add(0);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(10);


        System.out.println(treeSet);


    }



}
