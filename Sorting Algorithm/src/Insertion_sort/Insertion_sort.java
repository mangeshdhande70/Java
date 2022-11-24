package Insertion_sort;

public class Insertion_sort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,1,-2};

        insertion_sort(arr , arr.length);
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }
    public static void insertion_sort(int[] arr , int n)
    {
        for (int i = 0; i <= n-2 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                        swap(arr , j);
                    }
                    else {
                        break;
                    }
                }

            }

    }
    public static void swap(int a[] , int j)
    {
        int temp = a[j];
        a[j] = a[j-1];
        a[j-1] =temp;
    }
}
