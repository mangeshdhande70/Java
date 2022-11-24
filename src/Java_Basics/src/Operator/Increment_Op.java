package Operator;

public class Increment_Op {
    public static void main(String[] args) {
        int a= 6;
        int r1 = a++;
        System.out.println("*****Post-Increment*****");
        System.out.println("a = "+a);
        System.out.println("r1 = "+r1);

        System.out.println("*****Pre-Increment*****");
        int r2 = ++a;
        System.out.println("a = "+a);
        System.out.println("r2 = "+r2);


        System.out.println("\n**********\n");
        int  b = a++ + ++a + a--;
        System.out.println(a);
        System.out.println(b);




        System.out.println("**********");
        a = 5;
        int c = ++a + ++a - a-- + a++ - ++a + --a + a--;
        System.out.println(a);
        System.out.println(c);

    }
}
