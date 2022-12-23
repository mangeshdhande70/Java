package FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Test {


    public static void main(String[] args) {


        int [] arr = {10,5,20,15,30,2,3,4,7,8,9,10,45,56,44};

        // if u want to check arr data greater than 10 then use Predicate

        System.out.println("\n\n**** Greater than 10 Elements in Array  ******");
        Predicate<Integer> predicate = i -> i>10;
        greaterThan(predicate , arr);



        System.out.println("\n\n**** Even Elements in Array  ******");
        Predicate<Integer> predicate1 = variable -> (variable&1)==0;
        printingEvenElement(predicate1 , arr);



        System.out.println("\n\n**** Greater than 10 and no. should be Even in Elements in Array  ******");
        greaterThan(predicate.and(predicate1) , arr);


        System.out.println("\n\n**** Greater than 10 or Even Elements in Array  ******");
        greaterThan(predicate.or(predicate1) , arr);


       // negate reverse the method call if sorting is in Ascending order then it would return in reverse order
       // even to non-even
        System.out.println("\n\n**** Not Even Elements in Array  ******");
        greaterThan(predicate1.negate() , arr);
    }

    public static void greaterThan(Predicate<Integer> p , int[] arr )
    {


        for (int ele : arr) {
            if (p.test(ele)) // test calling lambda expression ----> i-> i>10
                System.out.print(ele+" ");

        }

    }

    public static void printingEvenElement(Predicate<Integer> p , int[] arr)
    {


        for (int ele : arr) {
            if (p.test(ele))
                System.out.print(ele+" ");

        }


    }



}
