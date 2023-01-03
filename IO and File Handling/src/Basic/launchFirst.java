/**

  => Write code to create a file named with demo.txt in current working directory (cwd) .

 */



package Basic;

import java.io.File;
import java.io.IOException;

public class launchFirst {


    public static void main(String[] args) throws IOException {




        /*

          * This line 1st check whether "newFile.txt" is already available or not, if it is already
            available then "file" simply refer the file.

          * if it is not already available then it won't create any physical file, JVM will create simple
            java file Object represent the name of the File.

         */

        File file = new File("newFile.txt"); // False

        System.out.println(file.exists());



        /*
           * It will create a Physical file if the file does not exist for the Java file Object.
         */
        file.createNewFile(); // Creating new File if it is not exist in Directory.

        System.out.println(file.exists()); //True


        System.out.println("\n\n***************************************");


        String path = "IPL Teams";



        /*

          * If user not provide any extension then it treats as a Directory, for JVM no difference
            b/w directory and file name.

          * java.io api classes are built using the standard of unix os.

          * In linux/Unix os there is no difference b/w file and directory.

         */

        File file1 = new File(path);

        System.out.println(file1.exists());// False

        file1.mkdir();

        System.out.println();
        System.out.println(file1.exists()); // True


        /**

         * creating file inside directory

         */
        System.out.println("\n\n***** creating file inside directory ****** ");

        File file2 = new File("iNeuron");

        file2.mkdir();

        System.out.println(file2.exists());

        File textFile = new File(file2 , "newFile2");

        textFile.createNewFile();

        System.out.println(textFile.exists());

        System.out.println(textFile.isFile());
        System.out.println(textFile.isDirectory());

        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());


        /**

         * To create File inside given directory

         */


        System.out.println("\n\n***** To create File inside given directory ******");

        String location = "c://pwSkills";

        File file3 = new File(location);
        file3.mkdir();

        System.out.println(file3.exists());

        File file4 = new File(file3 , "mangesh.txt");

        file4.createNewFile();

        System.out.println(file4.exists());

        File file5 = new File(file3 , "Images.png");
        file5.createNewFile();



    }


}
