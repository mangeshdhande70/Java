package Arrays.LengthOfString.TwoDArray;

public class BasicsTwod {

    public static void main(String[] args) {

        int [][] a = new int[4][];

        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
//        System.out.println(a[0][0]);

        int [] arr1 = new int[2];
        int[][] arr2 = new int[6][];
        int[][] arr3[] = new int[3][4][];

        System.out.println("ClassName arr1 : " +arr1.getClass().getName());
        System.out.println("ClassName arr2 : " +arr2.getClass().getName());
        System.out.println("ClassName arr3 : " +arr3.getClass().getName());

        arr1[0] = 1;
        arr1[1] = 2;
        int [] ab = arr1;
        System.out.println(arr1);
        System.out.println(ab);
        System.out.println(arr1[1]);
        System.out.println(ab[1]);

        Object o = new long[4];

        int [] array1 = {1,2,3,4};
        int [] array2 = {6,7};

//        int[] temp = array1;
        array1=array2;
        array2=array1;


        System.out.println(array1[0]);
        System.out.println(array2[0]);


    }
}
