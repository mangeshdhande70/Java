package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class launchFirst {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(15);
        arrayList.add(4);
        arrayList.add(14);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(5);


        // without Stream
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int a:arrayList) {
            if (a%2==0)
                arrayList1.add(a);

            System.out.println(a);
        }



        System.out.println("\n\n***** using Stream getting Even no ***********");

        List list = arrayList.stream().filter(a->a%2==0).collect(Collectors.toList());

        list.forEach(System.out::println);

        System.out.println("\n\n");
        System.out.println(list);



        System.out.println("\n\n***** using Stream getting  no multiple by 2 ***********");

        List list1 = arrayList.stream().map(obj ->obj*2).collect(Collectors.toList());

        list1.forEach(System.out::println);

        System.out.println("\n\n");
        System.out.println(list1);







    }


}

