package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchSecond {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sanket");
        arrayList.add("prashant");
        arrayList.add("ankit");
        arrayList.add("rakesh");


        System.out.println("*********** Using simple logic ***************");

        ArrayList<String> arrayList1 = new ArrayList<>();

        for (String name :
                arrayList) {

            arrayList1.add(name.toUpperCase());

        }

        System.out.println(arrayList1);

        System.out.println();

        arrayList1.forEach(System.out::println);



        System.out.println("****** Using Lambda expression ********");






        System.out.println("\n\n\n******* Using Stream API *********");

        List<String> list = arrayList.stream()
                                             .map(name -> name.toUpperCase())
                                             .collect(Collectors.toList());


        list.forEach(System.out :: println);



    }


}
