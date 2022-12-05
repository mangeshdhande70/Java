package Basic;


import java.util.Scanner;


class FinallyVsSystemExit{
    Scanner scanner = new Scanner(System.in);

    void  method() {
        try {
            System.out.println("Enter Numerator");
            int num1 = scanner.nextInt();

            System.out.println("Enter Denominator");
            int num2 = scanner.nextInt();

            int res = num1 / num2;

            System.out.println(res);
            System.exit(0);
            System.out.println("Successfully Executed"); // not executed
        }
        finally {
            System.out.println("Resources Disabled"); // // not executed
        }
        System.out.println("connection terminated");

    }
}

class ReturnVsFinally {


    Scanner scanner = new Scanner(System.in);

    int ans() {
        try {
            System.out.println("Enter Numerator");
            int num1 = scanner.nextInt();

            System.out.println("Enter Denominator");
            int num2 = scanner.nextInt();

            int res = num1 / num2;

            return res;
        }
        finally {
            System.out.println("Connection Disconnected using fiannly block");
        }
//        System.out.println("connection terminated");  // unreachable code
//
    }
}


class FinallyVsThrow {


    Scanner scanner = new Scanner(System.in);

    void method() {
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
        System.out.println("connection terminated");

    }

}



public class Finally {

    public static void main(String[] args) {


        FinallyVsSystemExit finallyVsSystemExit = new FinallyVsSystemExit();
        finallyVsSystemExit.method();

//        ReturnVsFinally returnVsFinally = new ReturnVsFinally();
//        System.out.println(returnVsFinally.ans());
//
//
//        FinallyVsThrow finallyVsThrow = new FinallyVsThrow();
//        finallyVsThrow.method();



    }




}
