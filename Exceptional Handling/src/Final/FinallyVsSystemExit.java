package Final;

import java.util.Scanner;

public class FinallyVsSystemExit {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        try {
            System.out.println("Enter Numerator");
            int num1 = scanner.nextInt();

            System.out.println("Enter Denominator");
            int num2 = scanner.nextInt();

            int res = num1 / num2;

            System.out.println(res);
            System.exit(0); // program terminated here others line won't execute even FinallyBlock
            System.out.println("Successfully Executed"); // not executed
        }
        finally {
            System.out.println("Resources Disabled"); // // not executed
        }
        System.out.println("connection terminated");

    }


}
