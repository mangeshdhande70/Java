package Statements_AND_Loops.Patterns;

public class Triangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5; j++) {

                if ((i == 1 && j==3) || (i== 2 && (j==2 || j==4)) || i==3 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println(" ");


            }

        }


    }

