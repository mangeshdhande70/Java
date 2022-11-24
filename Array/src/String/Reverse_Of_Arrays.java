package String;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Of_Arrays {
    public static void main(String[] args) {


        int[] array = new int[4];

        array[0] = 2;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
//        array[4] = 9;

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\n********* Reverse of arrays using Swapping ***********");

//        int mid = (array.length - 1) / 2;
//       System.out.println(mid);
        int j = array.length - 1;
        for (int i = 0; i < j; i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }

        for (int i : array) {
            System.out.print(i + " ");

        }

        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);

        Integer arrays[] = {10, 20, 30, 40, 50};
        reverse_using_collection(arrays );
    }



    static void reverse(int a[] , int n ) {

        System.out.println("\n********* Reverse of arrays using Temp Arrays ***********");


        int ar[] = new int[n];
        int p = 0;
        for (int i = n-1; i >= 0; i--) {
            ar[p] = a[i];
            p+=1;
        }
        for(int i : ar)
        {
            System.out.print(i+" ");
        }
    }

    static void reverse_using_collection(Integer a[] )
    {
        int n = a.length-1,j=0;
        System.out.println("\n********* Reverse of arrays using Collections method ***********");
        Collections.reverse(Arrays.asList(a));
        System.out.println();
        for(int i : a)
        {
            System.out.print(i+" ");
        }
//        int arr[] = new int[n];
//        for(int i = 0 ; i < n ; i++){
//        Collections.reverse(Arrays.asList(a));
//    }
//        for(int i:a)
//        {
//            System.out.print(i+" ");
//        }
    }

    }
