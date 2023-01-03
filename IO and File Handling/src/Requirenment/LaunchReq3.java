package Requirenment;

import java.io.*;

/**

 Requirement => Write a program to remove duplicates from the file

 */

public class LaunchReq3 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("Mobil.txt");

        BufferedReader br = new BufferedReader(fileReader);

        PrintWriter printWriter = new PrintWriter("Output.txt");

        String target = br.readLine();


        while (target != null) {
            boolean isAvailable = false;

            BufferedReader br2 = new BufferedReader(new FileReader("Output.txt"));
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
            target = br.readLine();
            }
            printWriter.close();

        }


}
