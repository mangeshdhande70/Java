/**

* Define
-------------------------------------------------------------------------------------------------------------------

 * Stream is an interface present in java.util.stream. Once we got the stream, by using that we can process objects of that collection.
   We can process the objects in the following 2 phases

         1.Configuration (arrayList.stream())
         2.Processing    (.filter().collect(Collector.toList())

 1) Configuration:
 We can configure either by using filter mechanism or by using map mechanism.


 * Filtering:
 ------------------------------------------------------------------------------------------------------

 * We can configure a filter to filter elements from the collection based on some boolean condition by using
   filter()method of Stream interface.

         public Stream filter(Predicate<T> t)
         here (Predicate<T > t ) can be a boolean valued function/lambda expression


         Ex:
             Stream s = c.stream();
             Stream s1 = s.filter(i -> i%2==0);
             Hence to filter elements of collection based on some Boolean condition we should go for filter() method.



 * Mapping:
 -----------------------------------------------------------------------------------------------------------------

 * If we want to create a separate new object, for every object present in the collection based on our
   requirement then we should go for map() method of Stream interface.

         public Stream map (Function f);
         It can be lambda expression also

         Ex:
             Stream s = c.stream();
             Stream s1 = s.map(i-> i+10);

     Once we performed configuration we can process objects by using several methods.


 */


package Stream.Base;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LaunchFirst {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 3, 1, 6, 7, 8, 4, 9,10);


        list.stream()
                .filter(n->((n&1)==0))
                .sorted()
                .map(var-> var*2)
                .forEach(System.out::println);




        System.out.println("\n\nFilter the data and perform addition ");

        int sum = list.stream()
                .filter(n->((n&1)==0))
                .map(even->even*2)
                .reduce(0,(c,e)->(c+e));

        System.out.println(sum);



        System.out.println("\n\n****** Sorting and evenList ******");

        Stream<Integer> sortingStream = list.stream().sorted();

        sortingStream.filter(i->i%2==0)
                .forEach(System.out::println);

        // stream has already been operated upon or closed ( bcz Stream is used only once)
        // sortingStream.forEach(System.out::println);  -->.IllegalStateException


    }


}
