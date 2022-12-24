/**



 * A function is a type of functional interface in Java that receives only a single argument and returns
   a value after the required processing.

 * It is a Functional interface present in java.util.function package

 ** Note :
 T ---> Input
 R ---> return Type

 public interface java.util.function.Function<T, R> {

 public abstract R apply(T);
 public default <V> java.util.function.Function<V, R> compose(java.util.function.Function<? super V, ? extends T>);
 public default <V> java.util.function.Function<T, V> andThen(java.util.function.Function<? super R, ? extends V>);
 public static <T> java.util.function.Function<T, T> identity();

 }


 * when we have to perform any Operation and have return something ( same type or diff Type)
   then we go for Function Interface.

 * map() method only accept Function reference in para or lambda expression.




 */



package FunctionalInterface.Function.pckg1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LaunchFirst {

    static Integer sum = 0;

    public static void main(String[] args) {



        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ABCD");
        arrayList.add("A");
        arrayList.add("PKMB");
        arrayList.add("KLPD");
        arrayList.add("LL");
        arrayList.add("KETAN");
        arrayList.add("CHAND");



        System.out.println("----------- By Using Anonymous Inner Class ---------------- ");
        Function<String , Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String str) {

                int length = str.length();
                return length ;
            }
        };

      List<Integer> list = arrayList.stream().map(function).collect(Collectors.toList());

      System.out.println(list);


      System.out.println("\n----------- By Passing Direct Passing Function Type Instance ---------------- ");

      List list1 = arrayList.stream().map(
              new Function<String, Integer>() {
                  @Override
                  public Integer apply(String s) {

                      return (s.length());
                  }

              }
      ).collect(Collectors.toList());


      System.out.println(list1);

      System.out.println("\n\n_------_-- For Each _--------_");
      list1.forEach(new Consumer() {
          @Override
          public void accept(Object o) {
              System.out.println(o);
          }
      });




        System.out.println("\n----------- By Lambda Expression ---------------- ");
        List<Integer> list2 = arrayList.stream().map(str->str.length()).collect(Collectors.toList());

        System.out.println(list2);


        System.out.println("\n\n_------Using Method Reference _---------_");
        list2.forEach(System.out::println);




    }




}
