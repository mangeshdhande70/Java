package Operator.BitwiseOperator;


/**

     assume a = 5 ----> binary ----> 0 1 0 1  and b = 2


        a =   0 1 0 1
        b =       1 0
 --------------------------
       ^ =    0 1 1 1   -----> 7



 --------------- tricks ---------------------------

     a ^ 1 = complement of a

     a ^ 0 = a ------>

     a ^ a = 0 ------> help to find unique element in arrays

    And

    a&1  ---> odd otherwise false



 */


public class Xor {


    public static void main(String[] args) {


           int i =5;
           System.out.println(i^2);
           System.out.println(6^1);
           System.out.println(14^1);
           System.out.println(15^1);


           int a=66;
           if ((a&1) == 0)
               System.out.println("even");
           else System.out.println("odd");




    }


}
