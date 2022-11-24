package String;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 0; j < T ; j++) {

           int N = sc.nextInt();
           int[] a = new int[N];
           for (int i = 0; i < N; i++) {

               a[i] = sc.nextInt();

           }
           System.out.println("***** Array *****");
           for (int i : a) {
               System.out.print(i + " ");
           }
           revers(a , N);
       }
    }

    static void revers(int []a , int n){

//        int mid = (n-1)/2;
        int j=n-1;
//        System.out.println(j);
        for (int i = 0; i < j; i++) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
        System.out.println("\n***** Reverse Array *****");
        for(int arr: a )
           System.out.print(arr+" ");

    }

}
