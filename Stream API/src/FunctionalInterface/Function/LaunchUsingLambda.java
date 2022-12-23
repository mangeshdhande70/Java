package FunctionalInterface.Function;

import java.util.function.Function;

public class LaunchUsingLambda {


    public static void main(String[] args) {


        Function<String , Integer > function = str ->
                     str.length();

       int length =  function.apply("String");

       System.out.println(length);


    }


}
