package Binary_search;

public class prac {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        int position = bs(arr,target, 0, arr.length-1);
        if (position == -1)
            System.out.println("Target Not found in Array");
        else
            System.out.println("Target Found at Index "+position);

    }
    public static int bs(int[] arr,int target,int s,int e){
             if (s > e)
                 return -1;
            int mid = s + (e - s) / 2;
            if (arr[mid] == target)
                return mid;

            if (target > arr[mid])
                return bs(arr, target, mid+1, e);

            return bs(arr, target, s , mid-1);


    }

}
