package Requirenment;

import java.io.*;


/**

 Requirement => file1.txt ,file2.txt copy all the contents to file3.txt

 */


public class LaunchReq1 {

    public static void main(String[] args) throws IOException {


        File file3 = new File("file3.txt");
        FileWriter fileWriter3 = new FileWriter(file3);

        PrintWriter printWriter3 = new PrintWriter(fileWriter3);

        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));

        String line = br.readLine();

        while (line!=null)
        {
            printWriter3.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("file2.txt"));
        line = br.readLine();

        while (line!=null)
        {
            printWriter3.println(line);
            line = br.readLine();
        }


        System.out.println("Check File");


        printWriter3.flush();

        printWriter3.close();


    }

}
