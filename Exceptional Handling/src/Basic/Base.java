package Basic;

import java.util.Scanner;

public class Base {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Connection Establish");
     try {
         System.out.println("Enter Numerator");
         int num1 = scanner.nextInt();

         System.out.println("Enter Denominator");
         int num2 = scanner.nextInt();

         int res = num1 / num2;


         System.out.println("result = " + res);
     }
     catch (Exception e){

         System.out.println("please don't enter Denominator zero "+e);
     }



        System.out.println("Connection Disconnected");


    }



}
