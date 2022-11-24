package mergeSort;

import java.util.Arrays;

public class prtact {
    public static void main(String[] args) {
        int arr[] = { 9,4,5,3,7,9,0};

        divide(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int arr[] , int s , int e){

        if (e-s == 1)
        {
            return;
        }

        int mid = s+(e-s)/2;

        divide(arr, 0 , mid);

        divide(arr, mid , e);

        mergg(arr , s , mid ,e);


    }

    public static void mergg(int arr[] , int s ,int m ,int e)
    {
        int mix[] = new int[e-s];
        int i=s;
        int j =m;
        int k = 0;

        while ( i < m && j< e)
        {
            if (arr[i] < arr[j])
            {
                mix[k++] = arr[i++];
            }
            else {
                mix[k++] = arr[j++];
            }
        }
        while (i < m) {
            mix[k++] = arr[i++];

        }
        while (j<e)
        {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s++] = mix[l];  // copying array from mix to original array

        }
    }
}
