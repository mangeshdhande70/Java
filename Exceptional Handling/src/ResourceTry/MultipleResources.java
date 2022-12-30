package ResourceTry;

import java.io.*;
import java.util.Scanner;

public class MultipleResources {


    public static void main(String[] args) throws FileNotFoundException {


        MultipleResources multipleResources = new MultipleResources();
        multipleResources.method();


    }


    void method() throws FileNotFoundException {

        String path = "C://Users//mangesh.dhande//Downloads//sample3.txt";

//        String path2 = "D:/mangesh.dhande//OneDrive - Infosys Limited//Desktop//Sample4.txt";

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);




        Scanner scanner = new Scanner(System.in);


        try(br;scanner;){

            System.out.print("Enter message");
            String msg = scanner.nextLine();
            System.out.println(msg);


            int c =0 ;
            while ((c=br.read()) != -1){
                System.out.print((char) c);
            }

        }catch (ArithmeticException a){
            a.printStackTrace();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
