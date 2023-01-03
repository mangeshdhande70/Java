package BufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchSecond {
    public static void main(String[] args) throws IOException {

        File file = new File("Courses.txt" );
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file , true);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("iNeuron");

        bufferedWriter.newLine();

        char[] arr = {'P','W','S','K','I','L','L','S'};

        bufferedWriter.write(arr);

        bufferedWriter.newLine();

        bufferedWriter.write("UNICORN");



        // after first time Run re-run again


        bufferedWriter.write("Python");
        bufferedWriter.write("Java");
        bufferedWriter.write("SpringBoot");

        bufferedWriter.flush(); // internally it is used FileWrite so, automatically fileWrite will flush

        bufferedWriter.close();

        System.out.println("See the File");

//        bufferedWriter.write("SpringBoot"); .IOException: Stream closed


    }
}
