package Operator.BitwiseOperator;

/**

   let's assume a = 15 ,  --- Binary ---->  1 1 1 1

     a >> 2  ---->   0 0 1 1   (add 2 zero's from left side and drop right side digit 2)

    0 0 1 1  ----- Decimal ----->  3



   -------------------------- Trick -----------------------

          a >> b = a / (2^b)



 */

public class RightShift {

    public static void main(String[] args) {


        int i = 15;

        System.out.println(i>>2);




    }


}
