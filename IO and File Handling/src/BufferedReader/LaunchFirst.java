package BufferedReader;

import java.io.*;

public class LaunchFirst {

    public static void main(String[] args) throws IOException {

        File file = new File("iNeuron.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();

        while (line != null)
        {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();







    }


}
