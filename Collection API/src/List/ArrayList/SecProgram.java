package List.ArrayList;

import java.util.ArrayList;

public class SecProgram {


    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();

        arrayList.add("sachin");
        arrayList.add("dhoni");
        arrayList.add(new Integer(10));
        arrayList.add(100);

        String s1 = (String) arrayList.get(0);
        System.out.println("s1 = "+s1 );
        String s2 = (String) arrayList.get(1);
        System.out.println("S2 = "+s2);

        String s5 = String.valueOf(arrayList.get(3));
        System.out.println("s5 = "+s5);

        String s4 = (String) arrayList.get(3); // ClassCastException
        System.out.println("s4 = "+s4);
        String s3 = (String) arrayList.get(2); // ClassCastException

//        String s6 = arrayList.get(2);  Typecasting is Required (CE)


//        System.out.println(s1+ " "+s2+" "+s3);


    }


}
