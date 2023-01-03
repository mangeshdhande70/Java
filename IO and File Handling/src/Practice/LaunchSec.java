package Practice;

import java.io.*;

/**
 *Copy from two File1 and File2
 */
public class LaunchSec {


    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader file1 = new FileReader("file1.txt");

        BufferedReader br1 = new BufferedReader(file1);

        String line1 = br1.readLine();


        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));

        String line2 = br2.readLine();

        PrintWriter pr = new PrintWriter("TwoCopy.txt");


        while (line1!=null) {
            pr.println(line1);
            line1 = br1.readLine();
        }

        while (line2!=null) {
            pr.println(line2);
            line2 = br2.readLine();
        }


        pr.flush();
        pr.close();

        System.out.println("Check File");

    }


}
