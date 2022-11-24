// Time Complexity = worst , Avg, best = O(N^2)

// Space Complexity = 1


package Selection_sort;

public class Selection_sort {

    public static void main(String[] args) {

        int [] arr = {10,9,4,0};

        selection_sort(arr , arr.length);
        print(arr);

    }

    public static void selection_sort(int[] a , int n){
        {
            int pass = 1;

            for (int i = 0; i < n-1; i++)     // N
            {
                int min_index=i;
//                int j = i + 1;
                for (int j =i+1; j < n; j++)  // N
                {
                   if (a[min_index] > a[j])
                   {
                       min_index = j;
                    }
                }
            swap(a, i, min_index);
            System.out.println("*** " +pass+"st pass *****");
            pass++;
            print(a);
            System.out.println("\n");

//            System.out.println(i);
        }
        }
    }
    public static void swap(int a[], int i, int min_index){
        int temp = a[i];
        a[i] = a[min_index];
        a[min_index] = temp;

//        a[i] = a[i] ^ a[min_index];
//        a[min_index] = a[i] ^ a[min_index];
//        a[i] = a[i] ^ a[min_index];
    }
    public static void print(int a[]){
        for(int arr : a)
        {
            System.out.print(arr+" ");
        }
    }
}
