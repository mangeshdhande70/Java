package FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Practice1 {

    public static void main(String[] args) {


        Predicate<Integer> predicate = i->(i&1)==0;


        boolean b = predicate.test(23);

        System.out.println(b);


        System.out.println(predicate.test(2));


    }


}
