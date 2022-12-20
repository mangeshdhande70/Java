package Base; /**


 Definition: The main objective of Generics is to provide Type-Safety and to resolve Type-Casting problems.


     Case 1: Type-Safety ---->

        * Arrays are always type safe that is we can give the guarantee for the type of elements present inside array.

        * For example if our programming requirement is to hold String type of objects it is recommended to
          use String array.

        * In the case of string array we can add only string type of objects by mistake if we are trying to add any
          other type we will get compile time error.

        * That is we can always provide guarantee for the type of elements present inside array and hence arrays are
          safe to use with respect to type that is arrays are type safe.

        * But collections are not type safe that is we can't provide any guarantee for the type of elements present
          inside collection.

        * For example if our programming requirement is to hold only string type of objects it is never recommended
          to go for ArrayList. By mistake if we are trying to add any other type we won't get any compile time
          error but the program may fail at runtime.

    Case 2: Type-Casting ---->

        In the case of array at the time of retrieval it is not required to perform any type casting
        But in the case of collection at the time of retrieval compulsory we should perform type
        casting otherwise we will get compile time error, hence in collections type casting is bigger headache.


 ----->
         To overcome the above problems of collections(type-safety, type casting)sun people
         introduced generics concept in 1.5v

         hence the main objectives of generics are:

         1. To provide type safety to the collections.
         2. To resolve type casting problems.




 */


import java.util.ArrayList;

public class a_WhyNeed {



    public static void main(String[] args) {




        String[] strings = new String[10];
        // Provide Type-Safety
        strings[0] = "Akash";
//        strings[1] = 10;  CE
        strings[2] = "Ketan";

        for (String s:strings) {
            System.out.println(s);
        }


        // Type-Casting
        String name1 = strings[0];
        String name2 = strings[1];

        System.out.println(name1+"    "+name2);




        // ANy Type of data u can put means Collection not provided type-safety.
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


        // Type-Casting Required
        // if you do Typecast wrong then we get error
        String s4 = (String) arrayList.get(3); // ClassCastException
        System.out.println("s4 = "+s4);
        String s3 = (String) arrayList.get(2); // ClassCastException


        // Collection ----> if you want Collection working as TypeSafety and Typecasting not required then
        // Generic Comes into picture

//        String s6 = arrayList.get(2);  Typecasting is Required (CE)


//        System.out.println(s1+ " "+s2+" "+s3);


    }




}
