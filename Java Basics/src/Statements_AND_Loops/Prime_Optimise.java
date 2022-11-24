package Statements_AND_Loops;

import java.util.Scanner;

public class Prime_Optimise {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int num = 9;
        boolean flag = false;

        if (num == 0 || num == 1)
            flag = true;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag== true)
            System.out.println(num+ " is Not a prime Number");
        else
            System.out.println(num+ " is a prime Number");
    }





}
