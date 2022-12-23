/**

   * Predicate is a Functional Interface in java.util.function package.


   public interface java.util.function.Predicate<T> {

         public abstract boolean test(T);   ////

         public default java.util.function.Predicate<T> and(java.util.function.Predicate<? super T>);
         public default java.util.function.Predicate<T> negate();
         public default java.util.function.Predicate<T> or(java.util.function.Predicate<? super T>);
         public static <T> java.util.function.Predicate<T> isEqual(java.lang.Object);
         public static <T> java.util.function.Predicate<T> not(java.util.function.Predicate<? super T>);

 }

 */





package FunctionalInterface.Predicate;


import java.util.function.Predicate;

class MyPredicator implements Predicate<Integer> {


    @Override
    public boolean test(Integer o) {

        if (o>10)
            return true;
        else
            return false;
    }
}

public class MyPredicate {


    public static void main(String[] args) {

        MyPredicator myPredicator = new MyPredicator();

        boolean r1 = myPredicator.test(100);
        boolean r2 = myPredicator.test(120);
        boolean r3 = myPredicator.test(10);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

//        boolean r4 = myPredicator.test(true); CE

    }

}
