package Practice;

import java.io.*;

/**
 * To deleting the content if this is present in another file and also content not present in current file.
 */

public class LaunchSix {

    public static void main(String[] args) throws IOException {


        String path = "C://Users//mangesh.dhande//IdeaProjects//Java//IO and File Handling//Text Files";

        File file1 = new File(path , "Mobil.txt");

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));

        String line1 = bufferedReader1.readLine();



        File file = new File(path , "Output.txt");

        PrintWriter pr = new PrintWriter(new FileWriter(file));

        while (line1!=null ){

            File file2 = new File(path , "dele.txt");
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
            String line2 = bufferedReader2.readLine();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line3 = br.readLine();

            boolean isAvailable = false;
            while (line2!=null) {
                if (line1.equals(line2)) {
                    isAvailable = true;
                    break;
                }
                line2 = bufferedReader2.readLine();
            }
            boolean isAvailableInFile = false;

            while (line3!=null) {
                if (line1.equals(line3)) {
                    isAvailableInFile = true;
                    break;
                }
                line3 = br.readLine();
            }

            if (!isAvailable && !isAvailableInFile ){
                pr.println(line1);
                pr.flush();
            }
            line1 = bufferedReader1.readLine();
        }
        bufferedReader1.close();
        pr.close();

    }


}
