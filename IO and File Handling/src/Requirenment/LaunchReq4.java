package Requirenment;

import java.io.*;

/**

 Requirement => Write a program to perform extraction of mobile no only if there is no duplicates

 */

public class LaunchReq4 {


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader("Mobil.txt"));

        String target = bufferedReader.readLine();

        PrintWriter printWriter = new PrintWriter("Du.txt");

        while (target !=null)
        {
            boolean isAvailable = false;

            BufferedReader br2 = new BufferedReader(new FileReader("dele.txt"));
            String line = br2.readLine();

            while (line != null) {
                if (target.equals(line)) {
                    isAvailable = true;
                    break;
                }
                line = br2.readLine();

            }

            if (isAvailable==false) {
                printWriter.println(target);
                printWriter.flush();
            }
            target = bufferedReader.readLine();
        }
        printWriter.close();
        }

}
