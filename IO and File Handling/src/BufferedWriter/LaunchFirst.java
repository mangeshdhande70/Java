package BufferedWriter;

import java.io.*;

public class LaunchFirst {


    public static void main(String[] args) throws IOException {


        File file = new File("iNeuron.txt");
        FileWriter fileWriter = new FileWriter(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("iNeuron");

        bufferedWriter.newLine();

        char[] arr = {'P','W','S','K','I','L','L','S'};

        bufferedWriter.write(arr);

        bufferedWriter.newLine();

        bufferedWriter.write("UNICORN");

        bufferedWriter.flush(); // internally it is used FileWrite so, automatically fileWrite will flush

        bufferedWriter.close();

        System.out.println("See the File");





    }


}
