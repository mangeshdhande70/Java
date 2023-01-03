package Practice;

import java.io.*;
import java.util.function.Predicate;

/**
 * To copy data from existing file.
 */

public class LaunchFirst {


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader("iNeuron.txt"));

        String line  = bufferedReader.readLine();

        PrintWriter pr = new PrintWriter("iNeuronCourses.txt");

        while (line!=null)
        {
            pr.println(line);
            line = bufferedReader.readLine();
        }

        pr.flush();
        pr.close();

        System.out.println("Check "+pr+" File");



    }


}
