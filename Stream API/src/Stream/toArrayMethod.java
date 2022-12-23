package Stream;

import java.util.ArrayList;

public class toArrayMethod {
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

        Object[] objArr = arrayList.stream().toArray();

        for (Object obj :
                objArr) {
            System.out.println(obj);
        }

        System.out.println("\n\n******* to Specific Type *******");

        // to Specific type
        // Constructor reference ----> Integer[]::new
       Integer[] objArr1 =  arrayList.stream().toArray(Integer[] ::new);

        for (Integer arr :
                objArr1) {
            System.out.println(arr);
        }

    }
}
