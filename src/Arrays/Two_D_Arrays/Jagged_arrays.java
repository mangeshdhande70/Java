/*

  Jaggged arrays not have fixed no of column but have no of rows are fixed

 */



package Arrays.Two_D_Arrays;

public class Jagged_arrays {
    public static void main(String[] args) {

        int [][]a = {
                {1,2,3},
                {4,5,6,7},
                {8,9}
        };

        System.out.println(a[0].length);   // {1,2,3}
        System.out.println(a[1].length);   // {4,5,6,7}
        System.out.println(a[2].length);   // {8,9}


        System.out.println("*** Jagged Arrays ***");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }



    }







}
