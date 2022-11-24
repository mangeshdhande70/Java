package Arrays.ArraysClass;

import java.util.Arrays;

public class MethodsInArrays {

    public static void main(String[] args) {

        int [] a = new int[6];

        System.out.println();
        for (int arr:a)
            System.out.print(" "+arr);

        Arrays.fill(a,5);

        System.out.println();
        for (int arr:a)
            System.out.print(" "+arr);

        Arrays.fill(a,3,5,10);

        System.out.println();
        for (int arr:a)
            System.out.print(" "+arr);


        int [] arr= new int[5];
        arr[0] = 100;
        arr[4] = 23;
        arr[2] = 43;
        arr[1] = 1;

        Arrays.sort(arr);

        System.out.println();
        for (int array:arr)
            System.out.print(" "+array);

        System.out.println();
        int res1 = Arrays.binarySearch(arr,43);
        int res2 = Arrays.binarySearch(arr,35); // 0 1 23 43 100 --- 35 is fit after 23 means at index 4 hence -4 bcz 35 not available
        System.out.println(" res1 = "+res1);
        System.out.println(" res2 = "+res2);






    }



}
