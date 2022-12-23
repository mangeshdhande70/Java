/**


 Communication with non generic code
 ===============================
 To provide compatibility with old version sun people compramized the concept of generics in very few area's the
 following is one such area.

 ArrayList arr = new ArrayList<String>();



 Conclusions :

 Generics concept is applicable only at compile time, at runtime there is no such type of concept.
 At the time of compilation, as the last step generics concept is removed,hence for jvm generics syntax won't be available.
 Hence, the following declarations are equal.

         ArrayList l=new ArrayList<String>();
         ArrayList l=new ArrayList<Integer>();
         ArrayList l =new Arraylist<Double>();

 All are equal at runtime,because compiler will remove these generic's syntax
 ArrayList l=new ArrayList();

 */




package CustomizedGeneric.GeneriMethods;

import java.util.ArrayList;

public class CompatibleForOlderVersion {

    // ArrayList arr = new ArrayList<String>();
    public static void m1(ArrayList a)
    {

        a.add("Sagar");
        a.add(10);
        a.add(34);
        a.add(true);

        System.out.println(a);

    }

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Diksha");
        arrayList.add("Mangesh");
        System.out.println(arrayList);

        System.out.println("\n\n");

        m1(arrayList);



        ArrayList l=new ArrayList<String>();

        l.add("Mangesh");
        l.add(45);
        l.add(true);




        ArrayList l1=new ArrayList<Integer>();

        l1.add("Akash");
        l1.add(true);
        l1.add(456);



        ArrayList l3 =new ArrayList<Double>();

        l3.add(34);
        l3.add(45F);
        l3.add("Akash");


        /**
         * All above three cases are same because of compiler only check LHS not RHS.

         * Generics concept is applicable only at compile time, at runtime there is no such type of concept.
           At the time of compilation, as the last step generics concept is removed,hence for jvm generics syntax won't be available.
           Hence, the following declarations are equal.
         *
         */


    }


}
