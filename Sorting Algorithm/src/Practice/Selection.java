package Practice;

import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {
        int arr[] ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size_of_array = sc.nextInt();
        arr = new int[size_of_array];
        System.out.println("Enter the"+size_of_array +" element in array ");
        for (int i = 0; i < size_of_array; i++) {

            arr[i] = sc.nextInt();

        }
        System.out.println("\nBefore Sorting");
        for (int i = 0; i < size_of_array; i++) {
            System.out.print(arr[i]+" ");

        }

        Selection obj = new Selection();
        obj.sort(arr , arr.length);
        System.out.println("\n\nAfter Sorting ");
        obj.print(arr);

    }

    public void sort(int a[] , int n){
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (a[min_index] > a[j]){
                    min_index = j;
                }
            }
            swap(a,i,min_index);

        }
    }

    public void swap(int []a , int i , int min_index){
//        int temp = a[i];
//        a[i] = a[min_index];
//        a[min_index] = temp;

//
//        a[i] = a[i] - a[min_index];
//        a[min_index] = a[i] + a[min_index];
//        a[i] = a[min_index] - a[i];

        a[i] = a[i] ^ a[min_index];
        a[min_index] = a[i] ^ a[min_index];
        a[i] = a[i] ^ a[min_index];

    }

    public void print(int a[])
    {
        for(int arr : a)
        {
            System.out.print(arr+" ");
        }
    }
}
