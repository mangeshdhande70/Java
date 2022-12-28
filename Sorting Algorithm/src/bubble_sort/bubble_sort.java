package bubble_sort;

public class bubble_sort {
    public static void main(String[] args) {
        int a[] = {5,2,3,1,4};
        Bubble_sort(a, a.length);

        for (int arr : a)
            System.out.print(arr+" ");
    }

    public static void Bubble_sort(int a[] , int n){

        for (int i = 0; i < n ; i++)
            for (int j = 1; j < n - i ; j++)
                if (a[j] < a[j-1])
                    swap(a , j);

    }
    public static void swap(int arr[],int j)
    {
      int temp = arr[j];
      arr[j] = arr[j-1];
      arr[j-1] = temp;

    }
}
