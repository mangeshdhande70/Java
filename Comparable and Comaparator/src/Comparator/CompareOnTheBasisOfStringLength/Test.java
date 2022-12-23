package Comparator.CompareOnTheBasisOfStringLength;


import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        //bcz there is a StringBuilder and StringBuffer element we can't cast these like this
//        String s1 = (String) o1;
//        String s2 = (String) o2;


        String s1 = o1.toString();
        String s2 = o2.toString();

        Integer l1 = s1.length();
        Integer l2 = s2.length();

        if (l1==l2)
        {
            return s1.compareTo(s2);
        }

        return l1.compareTo(l2);
    }
}

public class Test {


    public static void main(String[] args) {


        TreeSet treeSet = new TreeSet(new MyComparator());

        treeSet.add(new StringBuffer("ABC"));
        treeSet.add("A");
        treeSet.add(new StringBuffer("AB"));
        treeSet.add(new StringBuilder("ABCD"));
        treeSet.add("ACB");
        treeSet.add("B");

        System.out.println(treeSet);

    }

}
