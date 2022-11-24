package String.TwoDArray;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][]array = new int[3][4];

        for (int i = 0; i < array.length ; i++) {
            System.out.println("For "+(i+1)+"st "+"Array");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.println();
            System.out.println("For "+(i+1)+"st "+"Array");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }
}