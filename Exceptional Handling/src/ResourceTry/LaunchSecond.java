package ResourceTry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LaunchSecond {


    public static void main(String[] args) throws IOException {

        try(BufferedReader obj  = new BufferedReader(new FileReader("sample.txt")))
        {
            Scanner scanner = new Scanner(System.in);
           int num =  scanner.nextInt();
            System.out.println("Hello ");

        }


    }




}
