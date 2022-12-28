package Final;

import java.util.Scanner;

public class FinallyVsThrow {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter Numerator");
            int num1 = scanner.nextInt();

            System.out.println("Enter Denominator");
            int num2 = scanner.nextInt();

            int res = num1 / num2;

            System.out.println(res);
            System.out.println("Successfully Executed");
        } catch (ArithmeticException a) {
            System.out.println("Denominator not be zero");
            throw (a);
        } finally {
            System.out.println("Resources Disabled");
        }
        System.out.println("connection terminated");// if catch block is executed then this line won't be executed.

    }
}
