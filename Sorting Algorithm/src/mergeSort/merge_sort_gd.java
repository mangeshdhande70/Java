package mergeSort;

import java.util.Arrays;

public class merge_sort_gd {

    public static void main(String[] args) {
//        int arr[] = {3,6,89,2,46,-7};
        int arr[] = { 9,4,5,3,7,0,99,90,9};
        mergSortInplace(arr , 0 ,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergSortInplace(int arr[], int s , int e)
    {
        if (e-s == 1){
            return;
        }

        int mid = s + (e-s)/2;

        mergSortInplace(arr , 0 , mid); // divide the array from start to mid
        mergSortInplace(arr , mid , e);  // divide array from mid to end

        System.out.println(e+" "+ s +" "+ mid);

        mergInplace(arr , s , mid , e);

    }

    public static void mergInplace(int [] arr, int s , int m , int e){


        int mix[] = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e){
            if (arr[i] < arr[j])
            {
                mix[k++] = arr[i++];
            }
            else {
                mix[k++] = arr[j++];
            }

        }
        while (i < m)    // if first array not complete
        {
            mix[k++] = arr[i++];
        }
        while (j < e)
        {
            mix[k++] = arr[j++]; // if second array not complete
        }

//        System.out.println(s);

        for (int l = 0; l < mix.length; l++) {
            arr[s++] = mix[l];   // copying array from mix to original array
        }
    }

}
