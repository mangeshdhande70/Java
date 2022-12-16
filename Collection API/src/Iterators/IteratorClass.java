package Iterators;
// It is also called as Cursor


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorClass {


    public static void main(String[] args) {


            ArrayList arrayList = new ArrayList();

//            arrayList.add("ankit");
            arrayList.add(23);
            arrayList.add(25);
            arrayList.add(27);
            arrayList.add(29);
            arrayList.add(31);
//            arrayList.add("akash");
            arrayList.add('c');
//            arrayList.add(45.5f);

            System.out.println("\n\nUsing Simple For");

            for (int i = 0; i < arrayList.size() ; i++) {

                    System.out.print(arrayList.get(i)+" ");
            }

            System.out.println("\n\nUsing For Each");

            for (Object o: arrayList) {
                    System.out.print(o+" ");
            }


            System.out.println("\n\nUsing Iterator");

            Iterator iterator = arrayList.iterator();

            while (iterator.hasNext()) {


//               Integer i = (Integer) iterator.next();  String and Float is there then Exception will occur.
//                    System.out.println(i+" ");
                    Object o = iterator.next();
                    System.out.print(o+" ");
                   // System.out.print(iterator.next() + " ");

            }





            System.out.println("\n\nReverse");

            // Only available in List Interface means in ArrayList and LinkedList

            ListIterator itr = arrayList.listIterator(arrayList.size());

            while(itr.hasPrevious())
                    System.out.print(itr.previous()+" ");






    }


}
