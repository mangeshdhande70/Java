package mergeSort;

import java.util.Arrays;

public class M {


    public static void main(String[] args) {

        int arr[] = {3,2,0,4,1,5};

        mergeSortInPlace(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));

    }



    static void mergeSortInPlace(int [] a, int s,int e)
    {
        if (e-s==1) {
            return;
        }

        int mid = s+(e-s)/2;

        mergeSortInPlace(a , 0,mid);
        mergeSortInPlace(a,mid,e);

        mergeInPlace(a , 0,mid,e);

    }

    static int[] mergeInPlace(int arr[] , int s ,int mid,int e) {

        int newArr[] = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i<mid && j<e) {

            if (arr[i] < arr[j])
                newArr[k++] = arr[i++];
            else
                newArr[k++] = arr[j++];

        }

        while (i<mid)
            newArr[k++] = arr[i++];

        while (j<e)
            newArr[k++] = arr[j++];



        for (int l = 0; l < newArr.length; l++)
            arr[s++] = newArr[l];

        return arr;

    }

}
