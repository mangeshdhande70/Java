package List_Interface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Basic {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>(89);  // 89 is initial capacity of ARRAYLIST

        System.out.println(list.size());

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

        // Accessing elements using index
        int num = list.get(3);
        System.out.println(num);

        do
            while(true)
                 System.out.println("hello");
        while (true);
    }

}
