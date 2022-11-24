package bubble_sort;

public class bubble {
    public static void main(String[] args) {
        int a[] = {-2,45,0,11,-9};
        bubble_s(a , a.length);
        for(int arr : a)
        {
            System.out.print(arr+" ");
        }

    }
   public static void bubble_s(int a[] , int n){

       for (int i = 0; i < n; i++) {
           for (int j = i+1; j < n-i ; j++) {
               if (a[j] < a[j-1]){
                   swap(a , j);
               }

           }

       }

    }
    public static void swap(int a[] , int j){
        int temp = a[j];
        a[j] = a[j-1];
        a[j-1] = temp;
    }
}
