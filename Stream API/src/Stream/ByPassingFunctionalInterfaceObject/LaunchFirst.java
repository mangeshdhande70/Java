package Stream.ByPassingFunctionalInterfaceObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LaunchFirst {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(18);
        arrayList.add(14);
        arrayList.add(20);
        arrayList.add(22);
        arrayList.add(19);
        arrayList.add(22);
        arrayList.add(29);


        Predicate<Integer> predicate = i-> i>=18;


        List list = arrayList.stream()
                                .filter(predicate)
                                .collect(Collectors.toList());


        System.out.println(list);

        System.out.println();

        list.forEach(System.out::println);


        System.out.println("******************");

        arrayList.stream()
                .filter(age->age>=18)
                .forEach(System.out::println);


        Function<Integer , Integer> function = new Function() {
            @Override
            public Object apply(Object o) {
                Integer obj = (Integer) o;
                return (obj*2);
            }
        };


        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer+2);
            }
        };


        System.out.println("********** BY Passing Predicate and Function & Consumer ********");


        arrayList.stream()
                .filter(predicate)
                .map(function)
                .forEach(consumer);













    }



}
