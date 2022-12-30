package LeetCode;

import java.util.Scanner;

public class EquilibriumIndex {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Size");
//        int size =
//
//        System.out.println("Enter arr ");

        String str = "3,-4, 2, -1,-3, 2, 1";

        int index = equilibriumIndex(str);
        System.out.println("EI :- "+index);


        int a = method2(str);
        System.out.println("Using method2 "+a);
    }


    public static int equilibriumIndex(String str) {

        String[] str1 = str.split(",");
        int n = str1.length;

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=Integer.parseInt(str1[i].trim());
        }

        int firstString = Integer.parseInt(str1[0].trim());
        int lastString = Integer.parseInt(str1[str1.length-1].trim());

        if (sum-firstString==0)
            return 0;
        else if (sum-lastString==0)
            return n-1;
        else {
            int leftSum  = Integer.parseInt(str1[0].trim());
            int remainingSum = sum - leftSum;

            for (int i = 1; i < n; i++) {
                remainingSum-=Integer.parseInt(str1[i].trim());
                if (leftSum==remainingSum)
                     return i;
                else
                    leftSum+=Integer.parseInt(str1[i].trim());
            }
        }
        return -1;

    }


    public static int method2(String str)
    {
        String[] str1 = str.split(",");
        int sum=0;
        int n=str1.length;

        for (int i = 0; i < n; i++) {
            sum+=Integer.parseInt(str1[i].trim());
        }

        int firstEle = sum - Integer.parseInt(str1[0].trim());
        int lastEle = sum - Integer.parseInt(str1[n-1].trim());


        if (sum-firstEle==0)
            return 0;
        else if (sum-lastEle==0)
            return n-1;
        else {
            for (int i = 0; i < n; i++) {

                int leftSum  = 0;
                int rightSum = 0;

                for (int j = i+1; j < n ; j++)
                    leftSum+=Integer.parseInt(str1[j].trim());

                for (int j = i-1; j >=0 ; j--)
                    rightSum+=Integer.parseInt(str1[j].trim());

                if (leftSum==rightSum)
                    return i;

            }
        }

     return -1;
    }
}
