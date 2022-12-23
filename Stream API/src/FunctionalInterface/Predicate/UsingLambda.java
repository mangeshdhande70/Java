package FunctionalInterface.Predicate;


import java.util.function.Predicate;

public class UsingLambda {


    public static void main(String[] args) {


        Predicate<Integer> predicate = i-> i>10;

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(100));
        System.out.println(predicate.test(50));



        System.out.println("\n\n********* Using String *********");

        Predicate<String> predicate1 = (String str)->str.length() > 3;
        // also u can write like
        // Predicate<String> predicate1 = str->str.length() > 3;

        boolean res1 = predicate1.test("Mangesh");
        boolean res2 = predicate1.test("abc");
        boolean res3 = predicate1.test("Rakesh");
        boolean res4 = predicate1.test("Koko");
        boolean res5 = predicate1.test("a");


        System.out.println("res1 = "+res1);
        System.out.println("res2 = "+res2);
        System.out.println("res3 = "+res3);
        System.out.println("res4 = "+res4);
        System.out.println("res5 = "+res5);



    }

}
