package Practice;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * To find max length in text file
 */

public class LaunchFifth {


    public static void main(String[] args)  throws IOException {

        String path = "C://Users//mangesh.dhande//IdeaProjects//Java//IO and File Handling//Text Files//Length.txt";

        BufferedReader br = new BufferedReader(new FileReader(path));

        String  line  = br.readLine();

        int maxLength = 0;
        String str = null;

        while (line!=null)
        {
            if (maxLength < line.length()) {
                maxLength = line.length();
                str = line;
            }

            line = br.readLine();
        }

        System.out.println("Max length String is :: "+str);
        System.out.println("Max length  :: "+maxLength);



    }


}
