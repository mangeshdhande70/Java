package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * For copy first line of file1 and then first line of sec and continue.
 */

public class LaunchThird {


    public static void main(String[] args) throws IOException {


        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));

        String line1 = br1.readLine();


        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));

        String line2 = br2.readLine();

        PrintWriter pr = new PrintWriter("file4.txt");


        while (line1!=null || line2!=null)
        {
            if (line1!=null) {
                pr.println(line1);
                line1 = br1.readLine();
            }

            if (line2!=null)
            {
                pr.println(line2);
                line2 = br2.readLine();
            }

        }


        pr.flush();
        pr.close();

    }

}
