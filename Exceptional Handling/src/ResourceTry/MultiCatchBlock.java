package ResourceTry;

import java.io.*;
import java.util.Scanner;

public class MultiCatchBlock {


    public static void main(String[] args) throws IOException {


        String path = "D://mangesh.dhande//OneDrive - Infosys Limited//Desktop//Sample4.txt";

        String path1 = "C://Users//mangesh.dhande//Downloads//sample3.txt";

        FileReader fileReader = new FileReader(path);

        BufferedReader br = new BufferedReader(fileReader);

        Scanner scanner = new Scanner(System.in);

        FileReader fileReader1 = new FileReader(path1);

        BufferedReader br1 = new BufferedReader(fileReader);

        try(br;br1){

            int a = 0;
            System.out.println("Content : -");
            while ((a = br.read()) !=-1 ) {
                System.out.print((char)a);
            }

            System.out.println("\n\n__________________________________-");


                System.out.println("Enter Numerator");

                int num1 = scanner.nextInt();

                System.out.println("Enter Denominator");
                int num2 = scanner.nextInt();

                int res = num1 / num2;
                System.out.println("result = " + res);


                String str = null;

                System.out.println(str.length());


        }catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException a )
        {
            a.printStackTrace();
        }


    }




}
