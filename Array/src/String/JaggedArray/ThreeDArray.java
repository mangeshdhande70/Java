package String.JaggedArray;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [][][] arr = new int[2][3][3];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {
                    System.out.println("Enter marks of college "+ i+" class "+j+" Student "+k);
                    arr[i][j][k] = scan.nextInt();
                }

            }
        }

        System.out.println("Marks of student");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {
                 System.out.println("marks of college "+ i+" class "+j+" Student "+k);
                 System.out.println(arr[i][j][k]+" ");
                }
                System.out.println();
            }
        }


    }
}
