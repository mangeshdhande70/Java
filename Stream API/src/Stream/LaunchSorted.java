package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchSorted {


    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("paro");
        arrayList.add("rakesh");
        arrayList.add("ketan");
        arrayList.add("koko");
        arrayList.add("ankit");
        arrayList.add("akash");
        arrayList.add("mangesh");
        arrayList.add("chetan");
        arrayList.add("bhagat");

        System.out.println("Before Sorting :: "+arrayList);

        System.out.println();
      List<String> list1 = arrayList.stream().sorted().collect(Collectors.toList());

      System.out.println("After Sorting using default Natural Sorting :: "+list1);

      System.out.println();

      List<String> list2 = arrayList.stream().sorted((n1,n2) -> n2.compareTo(n1)).collect(Collectors.toList());

        System.out.println("After Sorting using customized Sorting :: "+list2);


    }




}
