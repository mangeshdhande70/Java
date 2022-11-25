package Operator.BitwiseOperator;

public class Operators {
    public static void main(String[] args) {

        /**
    _________________________________________________________________________________________________________________
    1) Arithmetic Operator.Operators
    2) Unary Operator.Operators
    3) Assignment Operator
    4) Relational Operator.Operators
    5) Logical Operator.Operators
    6) Ternary Operator
    7) Bitwise Operator.Operators
    8) Shift Operator.Operators
    9) instance of operator

    _________________________________________________________________________________________________________________

    _________________________________________________________________________________________________________________
       5  ***** LOGICAL Operator *****

           Conditional operators are:

             Note:  T || F ( if 1st one is true then it will not check for 2nd)

            &&, Logical AND: returns true when both conditions are true.
            ||, Logical OR: returns true if at least one condition is true.
            !, Logical NOT: returns true when a condition is false and vice-versa

            *
            AND (&&) Operator |  OR (||) Operator  | NOT (!)
                              |                    |
            T  T -> T         |  T  T -> T         | T -> F
            T  F -> F         |  T  F -> T         | F -> T
            F  T -> F         |  F  T -> T         |
            F  F -> F         |  F  F -> F         |
            *
            *

   _________________________________________________________________________________________________________________

       6. ***** Ternary operator *****

          Ternary operator is a shorthand version of the if-else statement.
          It has three operands and hence the name ternary.

                The general format is:

                    condition ? if true : if false



    _________________________________________________________________________________________________________________

       7  *****  BITWISE Operator  *****

           check both if it is true or not


          &, Bitwise AND operator: returns bit by bit AND of input values.
          |, Bitwise OR operator: returns bit by bit OR of input values.
          ^, Bitwise XOR operator: returns bit-by-bit XOR of input values.
          ~, Bitwise Complement Operator: This is a unary operator which returns the


        AND (&) Operator  |  OR (|) Operator   |  XOR (^)        A = 6  & B = 7 then A^B = ?
                          |                    |
        1  1 -> 1         |  1  1 -> 1         | 1  1 -> 0         A = 0 1 1 0
        1  0 -> 0         |  1  0 -> 1         | 1  0 -> 1         B = 0 1 1 1
        0  1 -> 0         |  0  1 -> 1         | 0  1 -> 1      -----------------
        0  0 -> 0         |  0  0 -> 0         | 0  0 -> 0             0 0 0 1



    Bitwise Complement Operator


      Thus it can be concluded from the above example that-

           * For any integer n, the bitwise complement of n will be -(n+1).
           * Bitwise complement of N = ~N (represented in 2’s complement form).
           * 2’complement of ~N= -(~(~N)+1) = -(N+1).

     Positive Integer
           ~ 2  = -3      -(2+1)
           ~ 3  = -4      -(3+1)

     Negative Integer

            ~ (-2)  = 1    -(-2+1)
            ~ (-3)  = 2    -(-3+1)
            ~ (-6)  = 5




    _________________________________________________________________________________________________________________

        8. ***** Shift Operator.Operators *****

            LEFT SHIFT  ---

                          5 << 2                         | 5 = 0 1 0 1 << two 0 is added in left side
                     5 = 0 1 0 1  == 0 1 0 1 0 0 = 20    | i.e  0 1 0 1 0 0 == 20
                                                         |

            RIGHT SHIFT ---

                        5 >> 2                      |  5 >> 2
                                                    |  5 =  0 1 0 1 >> 2
                                                    |       0 0 0 1
                                                    |  shift the two digit toward left and add two zero to right
                     5 = 0 1 0 1 ==  0 0 0 1        |-  side and th left side two digit will deleted
                                                    |


          3. Unsigned Right Shift Operator in Java
           Unsigned Right Shift Operator moves the bits of the integer a given number of places to the right.
           The sign bit was filled with 0s.
           The Bitwise Zero Fill Right Shift Operator is represented by the symbol >>>.

           Note: For negative bits, the signed and unsigned right shift operators provide different results.


           4. Unsigned Left Shift Operator in Java
                Unlike unsigned Right Shift, there is no “<<<” operator in Java because the logical (<<) and
                arithmetic left-shift (<<<) operations are identical.

         */


        int a = 6, b=7,c=90;
       if (a>b && a>c)
       {
           System.out.println(a);
       }
       else if(b > c)
       {
           System.out.println(b);
       }
       else {
           System.out.println(c);
       }



        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a^b);

        System.out.println(5 << 2);
        System.out.println(5 >> 2);

        System.out.println(~5);
        System.out.println(~6);
        System.out.println(~2);
        System.out.println(~10);

        System.out.println(~(-6));
        System.out.println(~(-3));
        System.out.println(~(-1));
        System.out.println(~0);
        System.out.println(~(-0));







    }
}
