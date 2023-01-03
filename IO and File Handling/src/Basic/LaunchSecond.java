/**

  * Requirement:

        1. Write code to create a file named with rcb.txt present in user path folder.
        2. to show List of Files and count the files and Directory.


 */



package Basic;

import java.io.File;
import java.io.IOException;

public class LaunchSecond {

    public static void main(String[] args) throws IOException {


        int count = 0;
        String path = "D://mangesh.dhande//OneDrive - Infosys Limited//Desktop//Ineuron course//Notes";

        File file = new File(path);

        String[] names = file.list();

        for (String name:names) {
            count++;
            System.out.println(name);
        }
      System.out.println("Total no of Files :: "+count);



        System.out.println("\n\n******* How many Directory and File is available ***************");

        File file1 = new File(path ,"iNeuron.txt");
        file1.createNewFile();

        int dirCount = 0;
        int fileCount = 0;
        for (String name:names) {

            File f = new File(name);
            if (f.isDirectory())
                dirCount++;

            if (f.isFile())
                fileCount++;

        }

        System.out.println("Total Directories :: "+dirCount);
        System.out.println("Total Files :: "+fileCount);


        System.out.println();

       // Returns the no of characters present in the file.
        System.out.println("Total character present inside File "+file1.length());
    }


}
