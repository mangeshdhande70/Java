package iterator.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class base {
    public static void main(String[] args) {

        List list = new ArrayList(); // collection of heterogeneous elements

        list.add(45);  // Integer list = new Integer(45);  // Autoboxing
        list.add(65);
        list.add(45.5);  // Float list = new Float(45.5);  // Autoboxing
        list.add("Mangesh");  // String list = new String("mangesh");
        list.add("89");
        list.add("c");


        for (Object o : list)  // object means any Datatype ex.. Integer, Float,String..etc
        {
            System.out.println(o);
        }

        System.out.println();
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println();
        System.out.println("using direct Iterator");
        list.iterator().forEachRemaining(
                System.out::println
        );

        list.remove("c");  // object removed
        list.remove(4); // index

        System.out.println("using direct Iterator");
        list.iterator().forEachRemaining(
                System.out::println
        );

//        list.stream().iterator();
    }
}
