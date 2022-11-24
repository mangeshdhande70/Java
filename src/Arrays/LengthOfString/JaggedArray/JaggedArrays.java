package Arrays.LengthOfString.JaggedArray;

public class JaggedArrays {

    public static void main(String[] args) {

        int a[][] = {{1,2},{3,4,5},{6,7,8}};

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        // Using Enhanced for loop
        for(int aa[] : a)
        {
            for(int arr : aa)
            {
                System.out.print(arr+" ");
            }
            System.out.println();
        }

        int [][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[8];
        arr[2] = new int[9];

        System.out.println("2D Jagged Array");

        arr[1][0]= 45;
        arr[0][3] = 90;
        arr[2][0] = 55;

        for (int []ar : arr)
        {
            for(int i : ar)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
