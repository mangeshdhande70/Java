package Requirenment;

import java.io.*;

/**

 Requirement => file1.txt file2.txt copy one line from file1.txt and from file2.txt to file3.txt.

 */


public class LaunchReq2 {


    public static void main(String[] args) throws IOException {


        PrintWriter printWriter = new PrintWriter(new FileWriter("files3.txt"));

        BufferedReader bufferedReader = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("file2.txt"));

        String line1 = bufferedReader.readLine();

        String line2 = bufferedReader2.readLine();

        while (line1 !=null || line2!=null)
        {
            if (line1!=null) {
                printWriter.println(line1);
                line1 = bufferedReader.readLine();
            }

            if (line2!=null) {
                printWriter.println(line2);
                line2 = bufferedReader2.readLine();
            }
        }

        System.out.println("Check File");

        printWriter.flush();
        printWriter.close();



    }


}
