package Final;

import java.util.Scanner;

public class ReturnVsFinally {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ReturnVsFinally obj = new ReturnVsFinally();
        int i = obj.ans();
        System.out.println("ans = "+i);
    }

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
            System.out.println("Connection Disconnected using finally block"); // it will execute before returning.
        }
//        System.out.println("connection terminated");  // unreachable code
//
    }
}
