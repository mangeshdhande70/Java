package QP;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

interface Anony {
    public static void main(String[] args) {
//        String str1 =null;
//        String str2 =new String("null");
//        System.out.println("null".equals(str1));
//        System.out.println("null".equals(str2));
////        System.out.println(str1.equals(null));
//
//        String s1 = "JAVA",s2 = "java";;
//        s1.toLowerCase();
//
//        System.out.println(s1.equals(s2));
//    }

//        Vector < Integer > vec = new Vector<Integer>();
//        vec.add(10);
//        vec.add(20);
//        vec.add(30);
//        vec.add(40);
//
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(null);
//        list.addAll(vec);
////        vec.copyInto(list);
//        System.out.println(list);

//        String inputDate = "22-12-1998";
//        LocalDate input = LocalDate.parse(inputDate);
//        System.out.println(input);




    }
    public static String converToupper(String input ) {
       try{
           return input.toUpperCase();
       }
       catch (NullPointerException ex){

       }
       return null;
    }

}