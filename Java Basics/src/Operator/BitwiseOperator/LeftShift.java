package Operator.BitwiseOperator;

/**

     lets assume, a = 14;  14 to binary ----   1 1 1 0

      a << 3 then  add 3 zero's to the right most side of the binary no.
      it becomes ----  1 1 1 0 0 0 0 ----- then convert it into Decimal

      1 1 1 0 0 0 0 ====- Decimal ====> 112 ---- this is the answer


     ---------------- trick ------------------------------------------

       a << b = a*2^b  ---- generalize solution

      a = 15 and b = 3

       then  15*2^3 == 15 * 8 --- 120



 */

public class LeftShift {

    public static void main(String[] args) {

        int a = 14;

        System.out.println(a<<3);


        System.out.println("\n****** some tricks ********");


        int i = 10;

        System.out.println(i<<1); // i<<1 ====> i*2


        int num = 10;

        int p = 3;

        int result = num << p;  // a * ( 2 to the power 'p' )   --- 10*2^3 --- 10 * 8 == 80

        System.out.println(result);


        System.out.println(15<<5);
        System.out.println(15<<3);




    }



}
