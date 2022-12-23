package Iterators.Fail_Safe_Fail_Fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {


    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();

        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(50);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
//            arrayList.add(45);  // -----> Infinite Loop
        }


        // Fail Fast

        System.out.println("***** Fail Fast *****");
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
//            arrayList.add(45);  //----->  execute and get ConcurrentModificationException
        }

        // Fail Safe
        System.out.println("\n\n***** Fail Safe *****");
        CopyOnWriteArrayList obj = new CopyOnWriteArrayList();
        obj.addAll(arrayList);

        System.out.print(obj+" ");

       Iterator itr = obj.iterator();

       System.out.println();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
            arrayList.add(200);  // ---> No Exception
        }



    }


}
