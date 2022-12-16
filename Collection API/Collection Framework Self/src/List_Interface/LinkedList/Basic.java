package List_Interface.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {

        LinkedList<Integer> list  = new LinkedList<>();

        list.add(45);
        list.add(42);
        list.remove(1);
        list.add(90);
        list.add(90);
        list.add(43);
        list.add(12);
        list.add(34);
        list.remove(4);
        System.out.println(list);

        System.out.println("size "+list.size());



        // Accessing elements using index
        int num = list.get(3);
        System.out.println(num);


        List<Integer> collect = new ArrayList<>();

        collect.add(100);
        collect.add(102);
        collect.add(103);

        list.addAll(collect);
        collect.addAll(list);

        System.out.println(list);
        System.out.println(collect);

        collect.add(1);
        collect.add(2);
        collect.add(3);

        System.out.println(collect);  // Arraylist contains 100, 102,102,1,2,3
        list.addAll(1,collect);
        System.out.println(list);

        list.addFirst(0);
        System.out.println(list);

        list.removeLast();
        System.out.println(list);



    }
}
