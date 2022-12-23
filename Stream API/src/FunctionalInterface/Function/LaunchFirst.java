package FunctionalInterface.Function;


/**

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

 */

import java.util.function.Function;

class MyFunction implements Function<String , Integer>
{

    // here String is input and return type is integer so, we use apply
    @Override
    public Integer apply(String str) {

        return str.length();
    }
}

public class LaunchFirst {

    public static void main(String[] args) {

        Function<String ,Integer> function = new MyFunction();

        int length = function.apply("Parekare");

        System.out.println(" Length :: "+length);

    }

}
