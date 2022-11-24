package mergeSort;

import java.util.Arrays;


public class mergSort {
    public static void main(String[] args) {
        int arr[] = {3,2,4,7,8,0};
        arr = merg_sort(arr);
        for (int i : arr)
        {
            System.out.print(i+" ");
        }


    }
    public static int[] merg_sort(int arr[]){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int left[] = merg_sort(Arrays.copyOfRange(arr , 0 , mid ));
        int right[] = merg_sort(Arrays.copyOfRange(arr , mid , arr.length));


        return  merge(left , right);


    }
    private static int[] merge(int first[] , int second[] )
    {
        int mix[] = new int[first.length + second.length];
        int i = 0 , j= 0, k= 0;
        while (i < first.length && j < second.length)
        {
            if (first[i] < second[j])
            {
                mix[k] = first[i++];
//                i++;

            }
            else {
                mix[k] = second[j++];
//                j++;
            }
            k++;
        }

        while (i < first.length ){
            mix[k++] = first[i];
            i++;
        }
        while (j < second.length){
            mix[k++] = second[j];
            j++;
        }

        return mix;
    }



}
