/**


 * Predicate is a Functional Interface in java.util.function package and has test method with
   returning boolean value.


         public interface java.util.function.Predicate<T> {

         public abstract boolean test(T);   ////

         public default java.util.function.Predicate<T> and(java.util.function.Predicate<? super T>);
         public default java.util.function.Predicate<T> negate();
         public default java.util.function.Predicate<T> or(java.util.function.Predicate<? super T>);
         public static <T> java.util.function.Predicate<T> isEqual(java.lang.Object);
         public static <T> java.util.function.Predicate<T> not(java.util.function.Predicate<? super T>);

         }


 * when we have to perform some operation and have to return only boolean value (true ,false)
   then we go for Predicate.


 * inside a filter method Predicate reference allowed or lambda expression.

 */






package FunctionalInterface.Predicate.pckg1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchFirst {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(21);
        arrayList.add(19);
        arrayList.add(14);
        arrayList.add(18);
        arrayList.add(17);
        arrayList.add(19);
        arrayList.add(20);




        System.out.println("_-------- By Using Anonymous Inner Class _---------");


        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer age) {

                return (age>18)?true:false;

            }
        };



       List<Integer> list =  arrayList.stream().filter(predicate).collect(Collectors.toList());
       System.out.println(list);


        System.out.println("\n\n_-------- By Passing Direct Predicate Type Object _---------");

        List<Integer> list1 =  arrayList.stream().filter(
                 new Predicate<Integer>() {
                     @Override
                     public boolean test(Integer age) {
                         return (age>18?true:false);
                     }
                 }
         ).collect(Collectors.toList());


        System.out.println(list1);




        System.out.println("\n\n_-------- By Using Lambda Expression _---------");

        List<Integer> list2 = arrayList.stream().filter(age->(age>18?true:false)).collect(Collectors.toList());


        list2.forEach(System.out::println);
//        list2.forEach(n->System.out.println(n));

        System.out.println(list2);

        System.out.println("\n\n_-------- Iterate by using Iterator _---------");

         Iterator iterator =  list2.iterator();

         while (iterator.hasNext())
             System.out.println(iterator.next());


        System.out.println("\n\n_-------- Iterate using ForEach Method _---------");

        list2.forEach(System.out::println);




        Stream<Integer> stream = arrayList.stream();

        stream.forEach(n->System.out.println(n));

        // stream has already been operated upon or closed ( bcz Stream is used only once)
       // stream.forEach(System.out::println);  --> IllegalStateException


        Stream<Integer> stream1 = arrayList.stream();
        Long count = stream1.count();
        System.out.println("Stream count ---->"+count);

        // stream has already been operated upon or closed ( bcz Stream is used only once)
        //  stream1.forEach(System.out::println);






    }


}
