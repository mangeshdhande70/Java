package Statements_AND_Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int i = 2;
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
//       int a = 7;
        if (a==1) {
            flag = true;
        }
        while(a > i)
        {
            while (a%i==0)
            {
                flag = true;
                break;
            }
            i++;
        }
        if (flag)
            System.out.println(a+" Not Prime");
        else
            System.out.println(a+" Prime");
    }
}
