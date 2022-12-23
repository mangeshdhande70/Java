package Comparator.Base;


import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {

        int i1 = (int)o1;
        int i2 = (int) o2;

        return (i1 > i2 ?-1:(i1==i2)?0:1);




    }


}

public class LaunchFirst {


    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new MyComparator());

        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(10);


        System.out.println(treeSet);


    }



}
