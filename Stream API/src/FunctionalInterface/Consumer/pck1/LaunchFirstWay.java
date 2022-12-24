/**

 Consumer :
 ---------------------------------------------------------------------------------------------------------

     * The Consumer functional interface in Java accepts a single gentrified argument and
       doesn't return any value.

     Syntax:

             @FunctionalInterface
             public interface Consumer<T>{
                  void accept(T t);   ---> public abstract void accept
             }


     * The consumer takes one generic type, the type of data it is going to take as a parameter.
       accept is the abstract method of the Consumer.


     * forEach method accept the Consumer reference or Lambda expression or method reference.

     * when we need to just printing or processing the data & no need to return anything then we go for Consumer.


 why we need Consumer Interface
 -----------------------------------------------------------------------------------------

     *  The Consumer Interface is a part of the java. util. function package which has been introduced
        since Java 8,to implement functional programming in Java. It represents a function which
        takes in one argument and produces a result.

 */





package FunctionalInterface.Consumer.pck1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LaunchFirstWay {


    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(21);
        arrayList.add(5);
        arrayList.add(38);
        arrayList.add(53);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(4);



        System.out.println("-------- Using Anonymous Inner Class  ------------");
        // Anonymous Inner class
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };


        arrayList.forEach(consumer);



        System.out.println("-------- Passing Direct Passing Consumer type Instance ------------");
        // By passing direct instance

        arrayList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });




        System.out.println("-------- Using Lambda ------------");
        // By Lambda

        arrayList.forEach(n -> System.out.println(n));








    }


}
