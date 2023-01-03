package FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFirst {

    public static void main(String[] args) throws IOException {

        File file = new File("Write.txt");

        // in existing file Overriding will happen
        // if u re-Run the program text will be overridden
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(97);
        fileWriter.write("\n");
        fileWriter.write("Hello Ankit ! How r u??");
        fileWriter.write("\n");
        char[] arr = {'M','A','N','G','E','S','H','0','7'};

        fileWriter.write(arr);

        fileWriter.close();

        System.out.println("Open writer.txt to see the output");


        File file1 = new File("mangesh.txt");

        // in existing file not Overriding will happen, appending will happen
        // if u re-Run the program the text will write at what time u run the program.
        FileWriter fileWriter1 = new FileWriter(file1,true);

        fileWriter1.write("\n");
        fileWriter1.write(97);
        fileWriter1.write("\n");
        fileWriter1.write("Hello Ankit ! How r u??");
        fileWriter1.write("\n");
        char[] arr2 = {'M','A','N','G','E','S','H','0','7'};

        fileWriter1.write(arr2);


        // Making the data to write the file.
           fileWriter1.flush();

        fileWriter1.close();

        System.out.println("Open writer.txt to see the output");



    }
}
