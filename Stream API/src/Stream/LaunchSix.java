package Stream;


import java.util.Arrays;
import java.util.List;

public class LaunchSix {


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


    }


}
