package Arrays;

public class Merge_two_sorted_Arrays {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4};
        int arr2[] = {1, 3, 4};
        int size = arr.length + arr2.length;
        int newArray[] = new int[size];
        newArray = merg(arr , arr2);
        for(int i : newArray)
        {
            System.out.print(i+" ");
        }
    }

    public static int[] merg(int arr[], int arr1[]) {

        int size = arr.length + arr1.length;
        int newArray[] = new int[size];
        int k = 0;
        int i = 0, j = 0;
        while (i < arr.length && j < arr1.length){
                if (arr[i] < arr1[j]) {
                    newArray[k++] = arr[i++];
                } else {
                    newArray[k++] = arr1[j++];
                }

            }
        while (i < arr.length) {
            newArray[k++] = arr[i++];
        }
        while (j < arr.length) {
            newArray[k++] = arr[j++];
        }
        return newArray;

    }
}
