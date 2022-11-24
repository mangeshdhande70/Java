// For binary search we need sorted array
// binary search not applicable for unsorted array


package Searching;

public class using_recurssion {

    public static void main(String[] args) {
        int a[] = {3, 4, 5, 6, 90, 561, 578, 900};
        int length = a.length;
        int target = 900;
        int target_index = searcht(a,target,  0, length-1);
        if(target_index == -1) {
            System.out.println(target+" NOT FOUND IN ARRAY");
        }
        else {
            System.out.println(target_index);
        }

    }

    public static int searcht(int[] arr,int target,  int low, int high) {

          if (low > high )
              return -1;
          int mid = (low + high) >>> 1;
//          int mid = low + (high - low)/2;
          if (target == arr[mid])
                return mid;
          if (target > arr[mid])
                return searcht(arr, target, mid+1, high);

          return searcht(arr, target, low, mid - 1);

        }

    }
