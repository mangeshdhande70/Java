package Practice;

public class binary {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 67};
        int target = 5;
        int target_index = binarySearch(arr, target, 0, arr.length);
        if(target_index == -1)
            System.out.println(target+" is not found in array");
        else
            System.out.println(target+" is found at "+target_index+" index");
    }

    public static int binarySearch(int a[], int target, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target)
                return mid;

            if (a[mid] > target)
                return binarySearch(a, target, start, mid - 1);

            return binarySearch(a, target, start + 1, end);

        }
        return -1;
    }

}
