package Stream;

import java.util.ArrayList;

public class LaunchFour_Min_And_Max {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(4);
        arrayList.add(14);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(5);

        System.out.println(arrayList);
        System.out.println();

        Integer min = arrayList.stream().min((i1 , i2) -> i1.compareTo(i2)).get();

        System.out.println("min = "+min);


        Integer max = arrayList.stream().max((i1 , i2) -> i1.compareTo(i2)).get();

        System.out.println("max = "+max);



    }


}
