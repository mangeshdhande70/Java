package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class FirstLaunch {

    public static void main(String[] args) {



        // only String data can be put so Type-safety is provided by Generics.
        // Type-Safety bcz of Generics
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mangesh");
        arrayList.add("Ketan");
//        arrayList.add(10);  u get Compile Time Error.

        System.out.println(arrayList);


        // Type-Casting is Not required bcz of Generics
        String s1 = arrayList.get(0);
        String s2 = arrayList.get(1);
        System.out.println();
        System.out.println(s1+"  "+s2);


        System.out.println("**********************************************i");


        // <String>  --->  TypeParameter
        // List      --->  BaseParameter
        // Polymorphism is only applicable for BaseParameter not for TypeParameter

        List<String > list =  new ArrayList<String>(); // Beauty of Polymorphism

        Collection<String> collection = new ArrayList<String>();

//        ArrayList<Object> arrayList1 = new ArrayList<String>();  Error bcz Polymorphism is only applicable for BaseParameter not for TypeParameter


        ArrayList<Object> arrayList1 = new ArrayList<>();

        Collection <String> collection1 = new LinkedList<>();

        Collection<Integer> collection2 = new LinkedList<>();


        System.out.println("\n\nPrimitive");
//        ArrayList<int> arrayList2 = new ArrayList<int>(); java: unexpected type required: reference , found: int








    }


}
