package Arrays.Two_D_Arrays;

public class arrays_of_arrays {
    public static void main(String[] args) {

        int a[][] = new int[3][2];   // a[rows][column] ;

        a[0][0] =10;
        a[0][1] = 20;
        a[1][0] = 30;
        a[1][1] = 40;
        a[2][0] = 50;
        a[2][1] = 60;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("\n******* using Foreach ********");
        for(int[] arr2: a)
        {
            for(int val: arr2) {
                System.out.print(val + " ");
            }
            System.out.println();
        }



    }
}
