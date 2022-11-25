package Binary_search;

public class Ap {


    public static void main(String[] args) {

        int arr[] = {1,2,4,6,7,9};
        int target = 9;
        System.out.println(bSearch(arr,target,0,arr.length-1));

    }

    public static int bSearch(int [] arr , int key,int low,int high)
    {

        int mid = (low+high) >>>1;

        if (key == arr[mid])
            return mid;

        if (arr[mid] > key)
            return bSearch(arr,key,low,mid-1);

        return bSearch(arr,key,mid+1,high);

    }



}
