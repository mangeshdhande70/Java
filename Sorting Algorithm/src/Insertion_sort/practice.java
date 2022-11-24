package Insertion_sort;

public class practice {
    public static void main(String[] args) {
        int arr[] = {9,5,1,4,3};
        sort(arr , arr.length);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int a[] , int n)
    {
        for (int i = 0; i < n-1 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (a[j] < a[j-1])
                {
                   swap(a , j);
                }
                else {
                    break;
                }

            }

        }
    }
    public  static void swap(int arr[] , int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;

    }
}
