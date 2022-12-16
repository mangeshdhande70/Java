package Set_interface.TreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {

    public static void main(String[] args) {

        Set<Integer> t1 = new TreeSet<>();

        t1.add(45);
        t1.add(56);
        t1.add(40);
        t1.add(56);
        t1.add(56);
        t1.add(12);

        System.out.println(t1);

        List l = new ArrayList<>();

        t1.addAll(l);

        System.out.println(l);


        l.addAll(t1);

        System.out.println(l);

        System.out.println(l.size());

        l.clear();
        System.out.println(l);



    }
}
