// For binary search we need sorted array
// binary search not applicable for unsorted array
// Time complexity 0(log n)

package Searching;

public class Binary_search {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,90,561,578,900};
        int target = 578;
        int size = a.length;

       int target_index = search(a , size , target);
       if(target_index == -1 )
           System.out.println(target+" Not Found in array");
       else
          System.out.println(target_index);

    }

    public static int search(int []a , int size,int target) {
        int low = 0, high = size - 1;
        for (int i = 0; i < size; i++) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target)
                return mid;
            if (target > a[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

        }
        return -1;
    }
}
